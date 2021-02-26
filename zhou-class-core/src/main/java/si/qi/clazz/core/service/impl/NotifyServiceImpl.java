package si.qi.clazz.core.service.impl;

import cn.hutool.json.JSONUtil;
import org.springframework.stereotype.Service;
import si.qi.clazz.core.bo.ClazzBO;
import si.qi.clazz.core.bo.NotifyBO;
import si.qi.clazz.core.bo.convert.ClazzBoConverter;
import si.qi.clazz.core.bo.convert.NotifyBoConverter;
import si.qi.clazz.core.request.NotifyAddRequest;
import si.qi.clazz.core.request.NotifyDeleteRequest;
import si.qi.clazz.core.request.NotifyQueryRequest;
import si.qi.clazz.core.request.NotifyUpdateRequest;
import si.qi.clazz.core.response.ClazzAddResponse;
import si.qi.clazz.core.response.NotifyAddResponse;
import si.qi.clazz.core.response.NotifyDeleteResponse;
import si.qi.clazz.core.response.NotifyQueryResponse;
import si.qi.clazz.core.response.NotifyUpdateResponse;
import si.qi.clazz.core.service.NotifyService;
import si.qi.clazz.core.vo.ClazzVO;
import si.qi.clazz.core.vo.NotifyVO;
import si.qi.clazz.core.vo.convert.ClazzVoConverter;
import si.qi.clazz.core.vo.convert.NotifyVoConverter;
import si.qi.clazz.domain.db.model.ClazzDO;
import si.qi.clazz.domain.db.model.NotifyDO;
import si.qi.clazz.repo.db.NotifyDao;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author makejava
 * @since 2021-02-07 00:23:14
 */
@Service("notifyService")
public class NotifyServiceImpl implements NotifyService {

    @Resource
    private NotifyDao notifyDao;

    @Override
    public NotifyQueryResponse queryByCondition(NotifyQueryRequest request) {
        NotifyQueryResponse response = new NotifyQueryResponse();

        List<NotifyDO> notifyList = notifyDao.queryByCondition(request.getId(), request.getType(), request.getTime(), request.getContent(),
                request.getAuthorId(), request.getTitle(), request.getClassIds(), request.getPage(), request.getLimit());

        // 转bo
        List<NotifyBO> notifyBOList = NotifyBoConverter.INSTANCE.cvt2BoList(notifyList);

        // 业务逻辑

        // 转vo
        List<NotifyVO> notifyVOList = NotifyVoConverter.INSTANCE.cvt2VoList(notifyBOList);
        response.setNotifyList(notifyVOList);

        // 分页信息
        response.buildPageSuccessRes(request.getPage(), request.getLimit(), 100);
        return response;
    }

    @Override
    public NotifyAddResponse insert(NotifyAddRequest request) {
        NotifyAddResponse response = new NotifyAddResponse();

        NotifyBO notify = new NotifyBO();
        notify.setType(request.getType());
        notify.setTitle(request.getTitle());
        notify.setContent(request.getContent());
        notify.setAuthorId(request.getAuthorId());
        notify.setClassIds(request.getClassIds());
        notify.setTime(request.getTime());
        notify.setExt(JSONUtil.toJsonStr(request.getExt()));

        // 转do
        NotifyDO notifyDO = NotifyBoConverter.INSTANCE.cvt2Do(notify);

        notifyDao.insert(notifyDO);

        // 转vo
        response.setNotifyInfo(NotifyVoConverter.INSTANCE.cvt2Vo(notify));
        return response;
    }

    @Override
    public NotifyUpdateResponse update(NotifyUpdateRequest request) {
        return null;
    }

    @Override
    public NotifyDeleteResponse deleteById(NotifyDeleteRequest request) {
        NotifyDeleteResponse response = new NotifyDeleteResponse();

        boolean success = notifyDao.deleteById(request.getId()) > 0;
        response.setSuccess(success);

        return response;
    }
}