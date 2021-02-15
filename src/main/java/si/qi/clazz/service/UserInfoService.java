package si.qi.clazz.service;

import si.qi.clazz.entity.UserInfo;

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
    UserInfo queryByUid(Long uid);

    /**
     * 查询多条数据
     *
     * @param page 查询起始位置
     * @param size  查询条数
     * @return 对象列表
     */
    List<UserInfo> queryAllByLimit(int page, int size);

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    UserInfo insert(UserInfo userInfo);

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    UserInfo update(UserInfo userInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}