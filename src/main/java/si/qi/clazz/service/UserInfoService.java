package si.qi.clazz.service;

import si.qi.clazz.common.PageResult;
import si.qi.clazz.entity.UserInfo;
import si.qi.clazz.model.request.UserAddRequest;
import si.qi.clazz.model.request.UserDeleteRequest;
import si.qi.clazz.model.request.UserUpdateRequest;
import si.qi.clazz.model.response.*;

import java.util.List;

/**
 * (UserInfo)表服务接口
 *
 * @author makejava
 * @since 2021-02-07 00:23:51
 */
public interface UserInfoService {

    /**
     * 通过UID查询单条数据
     *
     * @param uid
     * @return 实例对象
     */
    UserResponse queryByUid(Long uid);

    /**
     * 查询多条数据
     *
     * @param page 查询起始位置
     * @param size  查询条数
     * @return 对象列表
     */
    UserPageResponse queryAllByLimit(int page, int size);

    /**
     * 新增数据
     */
    UserAddResponse insert(UserAddRequest request);

    /**
     * 修改数据
     */
    UserUpdateResponse update(UserUpdateRequest request);

    /**
     * 通过uid删除数据
     */
    UserDeleteResponse deleteByUid(UserDeleteRequest request);
}