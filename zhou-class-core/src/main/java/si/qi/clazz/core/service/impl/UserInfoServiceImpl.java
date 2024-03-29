package si.qi.clazz.core.service.impl;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;
import si.qi.clazz.common.enums.ConsoleRoleEnum;
import si.qi.clazz.core.bo.UserInfoBO;
import si.qi.clazz.core.bo.convert.UserInfoBoConverter;
import si.qi.clazz.core.request.UserAddRequest;
import si.qi.clazz.core.request.UserDeleteRequest;
import si.qi.clazz.core.request.UserQueryRequest;
import si.qi.clazz.core.request.UserUpdateRequest;
import si.qi.clazz.core.response.*;
import si.qi.clazz.core.service.UserInfoService;
import si.qi.clazz.core.vo.UserInfoVO;
import si.qi.clazz.core.vo.convert.UserInfoVoConverter;
import si.qi.clazz.domain.db.model.UserInfoDO;
import si.qi.clazz.repo.db.UserInfoMapper;

import javax.annotation.Resource;
import java.util.List;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserQueryResponse queryByCondition(UserQueryRequest request) {
        UserQueryResponse response = new UserQueryResponse();

        // check查询参数

        QueryWrapper<UserInfoDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(request.getId() != null, UserInfoDO::getId, request.getId())
                .eq(request.getUid() != null, UserInfoDO::getUid, request.getUid())
                .eq(request.getWechatName() != null, UserInfoDO::getWechatName, request.getWechatName())
                .eq(request.getNickName() != null, UserInfoDO::getNickName, request.getNickName())
                .eq(request.getPhone() != null, UserInfoDO::getPhone, request.getPhone())
                .eq(request.getRoles() != null, UserInfoDO::getRoles, request.getRoles())
                .eq(request.getClasses() !=  null, UserInfoDO::getClasses, request.getClasses());

        Page<UserInfoDO> page = new Page<>(request.getPage(), request.getLimit());
        Page<UserInfoDO> userInfoPageResult = userInfoMapper.selectPage(page, queryWrapper);

        // 转bo
        List<UserInfoBO> userInfoBOList = UserInfoBoConverter.INSTANCE.cvt2BoList(userInfoPageResult.getRecords());

        // 业务逻辑

        // 转vo
        List<UserInfoVO> userInfoVOList = UserInfoVoConverter.INSTANCE.cvt2VoList(userInfoBOList);

        response.setUserInfos(userInfoVOList);
        response.buildPageSuccessRes(request.getPage(), request.getLimit(), userInfoPageResult.getTotal());
        return response;
    }

    @Override
    public UserAddResponse insert(UserAddRequest request) {
        UserAddResponse response = new UserAddResponse();

        UserInfoBO userInfo = new UserInfoBO();
        // TODO：可以把一些特殊逻辑放在convert中
        userInfo.setUid(RandomUtil.randomLong());
        userInfo.setClasses(request.getClasses());
        userInfo.setPhone(request.getPhone());
        userInfo.setPassword(request.getPassword());
        userInfo.setNickName(request.getNickName());
        userInfo.setRoles(Lists.newArrayList(ConsoleRoleEnum.VISITOR.getCode()));

        // 转do
        userInfoMapper.insert(UserInfoBoConverter.INSTANCE.cvt2Do(userInfo));

        // 转vo
        response.setUserInfo(UserInfoVoConverter.INSTANCE.cvt2Vo(userInfo));
        return response;
    }

    @Override
    public UserUpdateResponse update(UserUpdateRequest request) {
        UserUpdateResponse response = new UserUpdateResponse();

        UserInfoBO userInfo = new UserInfoBO();
        // TODO：
        userInfo.setUid(request.getUid());
        userInfo.setClasses(request.getClasses());
        userInfo.setPhone(request.getPhone());
        userInfo.setPassword(request.getPassword());
        userInfo.setNickName(request.getNickName());
        userInfo.setRoles(request.getRoles());

        // 转do
//        userInfoMapper.update(UserInfoBoConverter.INSTANCE.cvt2Do(userInfo));

        // 转vo
        response.setUserInfo(UserInfoVoConverter.INSTANCE.cvt2Vo(userInfo));
        return response;
    }

    @Override
    public UserDeleteResponse deleteByUid(UserDeleteRequest request) {
        UserDeleteResponse response = new UserDeleteResponse();

//        response.setSuccess(userInfoMapper.deleteByUid(request.getUid()) > 0);

        return response;
    }
}