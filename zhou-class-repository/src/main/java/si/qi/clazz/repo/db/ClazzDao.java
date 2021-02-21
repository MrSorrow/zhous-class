package si.qi.clazz.repo.db;

import org.apache.ibatis.annotations.Param;
import si.qi.clazz.domain.db.model.ClazzDO;

import java.util.List;

/**
 * (Clazz)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-07 00:22:53
 */
public interface ClazzDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ClazzDO queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param id
     * @param schoolName
     * @param grade
     * @param classNumber
     * @param offset      查询起始位置
     * @param limit       查询条数
     * @return 对象列表
     */
    List<ClazzDO> queryAllByLimit(Long id, String schoolName, Integer grade, Integer classNumber,
                                  @Param("offset") int offset, @Param("limit") int limit);

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 影响行数
     */
    int insert(ClazzDO clazz);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Clazz> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ClazzDO> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Clazz> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ClazzDO> entities);

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 影响行数
     */
    int update(ClazzDO clazz);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}