package si.qi.clazz.core.service;

import si.qi.clazz.core.request.UserAddRequest;
import si.qi.clazz.core.request.UserDeleteRequest;
import si.qi.clazz.core.request.UserUpdateRequest;
import si.qi.clazz.core.response.*;

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
    UserQueryResponse queryByUid(Long uid);

    /**
     * 查询多条数据
     *
     *
     * @param uid
     * @param page 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    UserQueryResponse queryAllByCondition(long uid, int page, int limit);

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