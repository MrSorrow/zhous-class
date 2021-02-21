package si.qi.clazz.repo.db;

import org.apache.ibatis.annotations.Param;
import si.qi.clazz.domain.db.model.NotifyDO;

import java.util.List;

/**
 * (Notify)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-07 00:23:13
 */
public interface NotifyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NotifyDO queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NotifyDO> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param notify 实例对象
     * @return 对象列表
     */
    List<NotifyDO> queryAll(NotifyDO notify);

    /**
     * 新增数据
     *
     * @param notify 实例对象
     * @return 影响行数
     */
    int insert(NotifyDO notify);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Notify> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<NotifyDO> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Notify> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<NotifyDO> entities);

    /**
     * 修改数据
     *
     * @param notify 实例对象
     * @return 影响行数
     */
    int update(NotifyDO notify);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}