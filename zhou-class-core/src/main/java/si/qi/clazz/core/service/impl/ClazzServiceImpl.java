package si.qi.clazz.core.service.impl;

import cn.hutool.json.JSONUtil;
import org.springframework.stereotype.Service;
import si.qi.clazz.core.bo.ClazzBO;
import si.qi.clazz.core.bo.convert.ClazzBoConverter;
import si.qi.clazz.core.request.ClazzAddRequest;
import si.qi.clazz.core.request.ClazzDeleteRequest;
import si.qi.clazz.core.request.ClazzQueryRequest;
import si.qi.clazz.core.request.ClazzUpdateRequest;
import si.qi.clazz.core.response.ClazzAddResponse;
import si.qi.clazz.core.response.ClazzDeleteResponse;
import si.qi.clazz.core.response.ClazzQueryResponse;
import si.qi.clazz.core.response.ClazzUpdateResponse;
import si.qi.clazz.core.service.ClazzService;
import si.qi.clazz.core.vo.ClazzVO;
import si.qi.clazz.core.vo.convert.ClazzVoConverter;
import si.qi.clazz.domain.db.model.ClazzDO;
import si.qi.clazz.repo.db.ClazzDao;

import javax.annotation.Resource;
import java.util.List;

@Service("clazzService")
public class ClazzServiceImpl implements ClazzService {

    @Resource
    private ClazzDao clazzDao;

    @Override
    public ClazzQueryResponse queryByCondition(ClazzQueryRequest request) {
        ClazzQueryResponse response = new ClazzQueryResponse();

        List<ClazzDO> clazzList = clazzDao.queryByCondition(request.getId(), request.getSchoolName(),
                request.getGrade(), request.getClassNumber(), request.getPage(), request.getLimit());

        // 转bo
        List<ClazzBO> clazzBOList = ClazzBoConverter.INSTANCE.cvt2BoList(clazzList);

        // 业务逻辑

        // 转vo
        List<ClazzVO> clazzVOList = ClazzVoConverter.INSTANCE.cvt2VoList(clazzBOList);
        response.setClazzList(clazzVOList);

        // 分页信息
        response.buildPageSuccessRes(request.getPage(), request.getLimit(), 100L);
        return response;
    }

    @Override
    public ClazzAddResponse insert(ClazzAddRequest request) {
        ClazzAddResponse response = new ClazzAddResponse();

        ClazzBO clazz = new ClazzBO();
        clazz.setSchoolName(request.getSchoolName());
        clazz.setGrade(request.getGrade());
        clazz.setClassNumber(request.getClassNumber());
        clazz.setExt(JSONUtil.toJsonStr(request.getExt()));

        // 转do
        ClazzDO clazzDO = ClazzBoConverter.INSTANCE.cvt2Do(clazz);

        clazzDao.insert(clazzDO);

        // 转vo
        response.setClazzInfo(ClazzVoConverter.INSTANCE.cvt2Vo(clazz));
        return response;
    }

    @Override
    public ClazzUpdateResponse update(ClazzUpdateRequest request) {
        ClazzUpdateResponse response = new ClazzUpdateResponse();

        ClazzBO clazz = new ClazzBO();
        clazz.setId(request.getId());
        clazz.setSchoolName(request.getSchoolName());
        clazz.setGrade(request.getGrade());
        clazz.setClassNumber(request.getClassNumber());
        clazz.setExt(JSONUtil.toJsonStr(request.getExt()));

        // 转do
        ClazzDO clazzDO = ClazzBoConverter.INSTANCE.cvt2Do(clazz);

        clazzDao.update(clazzDO);

        // 转vo
        response.setClazzInfo(ClazzVoConverter.INSTANCE.cvt2Vo(clazz));
        return response;

    }

    @Override
    public ClazzDeleteResponse deleteById(ClazzDeleteRequest request) {
        ClazzDeleteResponse response = new ClazzDeleteResponse();
        boolean success = clazzDao.deleteById(request.getId()) > 0;
        response.setSuccess(success);
        return response;
    }
}