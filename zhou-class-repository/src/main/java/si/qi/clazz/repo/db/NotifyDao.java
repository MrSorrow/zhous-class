package si.qi.clazz.repo.db;

import org.apache.ibatis.annotations.Param;
import si.qi.clazz.domain.db.model.NotifyDO;

import java.util.List;

/**
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
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NotifyDO> queryByCondition(Long id, Integer type, Integer time, String content, Long authorId, String title,
                                    String classIds, @Param("offset") int offset, @Param("limit") int limit);

    /**
     * 新增数据
     *
     * @param notify 实例对象
     * @return 影响行数
     */
    int insert(NotifyDO notify);

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