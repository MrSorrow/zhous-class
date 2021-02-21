package si.qi.clazz.repo.db;

import org.apache.ibatis.annotations.Param;
import si.qi.clazz.domain.db.model.UserInfoDO;

import java.util.List;

/**
 * (UserInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-07 00:23:50
 */
public interface UserInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid uid
     * @return 实例对象
     */
    UserInfoDO queryByUid(Long uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserInfoDO> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userInfo 实例对象
     * @return 对象列表
     */
    List<UserInfoDO> queryAll(UserInfoDO userInfo);

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 影响行数
     */
    int insert(UserInfoDO userInfo);

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 影响行数
     */
    int update(UserInfoDO userInfo);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteByUid(Long uid);

}