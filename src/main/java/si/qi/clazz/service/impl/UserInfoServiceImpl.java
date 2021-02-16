package si.qi.clazz.service.impl;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSONUtil;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import si.qi.clazz.common.PageResult;
import si.qi.clazz.common.enums.ConsoleRoleEnum;
import si.qi.clazz.dao.UserInfoDao;
import si.qi.clazz.entity.UserInfo;
import si.qi.clazz.model.request.UserAddRequest;
import si.qi.clazz.model.request.UserDeleteRequest;
import si.qi.clazz.model.request.UserUpdateRequest;
import si.qi.clazz.model.response.*;
import si.qi.clazz.service.UserInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-02-07 00:23:51
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    /**
     * 通过UID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public UserResponse queryByUid(Long uid) {
        UserResponse response = new UserResponse();
        UserInfo userInfo = userInfoDao.queryByUid(uid);
        response.setUserInfo(userInfo);
        return response;
    }

    /**
     * 查询多条数据
     *
     * @param page 页数
     * @param size 条数
     * @return 对象列表
     */
    @Override
    public UserPageResponse queryAllByLimit(int page, int size) {
        UserPageResponse response = new UserPageResponse();

        int offset = (page - 1) * size;
        List<UserInfo> userInfos = userInfoDao.queryAllByLimit(offset, size);
        Integer total = 100;

        PageResult<List<UserInfo>> pageResult = PageResult.<List<UserInfo>>builder()
                .data(userInfos)
                .page(page)
                .size(size)
                .total(total)
                .build();

        response.setUserInfos(pageResult);
        return response;
    }

    @Override
    public UserAddResponse insert(UserAddRequest request) {
        UserAddResponse response = new UserAddResponse();

        UserInfo userInfo = new UserInfo();
        // TODO：
        userInfo.setUid(RandomUtil.randomLong());
        userInfo.setClasses(JSONUtil.toJsonStr(Lists.newArrayList(request.getClasses())));
        userInfo.setPhone(request.getPhone());
        userInfo.setPassword(request.getPassword());
        userInfo.setNickName(request.getNickName());
        userInfo.setRole(ConsoleRoleEnum.VISITOR.getCode());
        userInfoDao.insert(userInfo);

        response.setUserInfo(userInfo);
        return response;
    }

    @Override
    public UserUpdateResponse update(UserUpdateRequest request) {
        UserUpdateResponse response = new UserUpdateResponse();

        UserInfo userInfo = new UserInfo();
        // TODO：
        userInfo.setUid(request.getUid());
        userInfo.setClasses(JSONUtil.toJsonStr(Lists.newArrayList(request.getClasses())));
        userInfo.setPhone(request.getPhone());
        userInfo.setPassword(request.getPassword());
        userInfo.setNickName(request.getNickName());
        userInfo.setRole(ConsoleRoleEnum.getByCode(request.getRole()).getCode());

        userInfoDao.update(userInfo);

        response.setUserInfo(userInfo);
        return response;
    }

    @Override
    public UserDeleteResponse deleteByUid(UserDeleteRequest request) {
        UserDeleteResponse response = new UserDeleteResponse();

        response.setSuccess(userInfoDao.deleteByUid(request.getUid()) > 0);

        return response;
    }
}