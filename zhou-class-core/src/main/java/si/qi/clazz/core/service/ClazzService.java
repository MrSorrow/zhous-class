package si.qi.clazz.core.service;

import si.qi.clazz.domain.db.model.ClazzDO;

import java.util.List;

/**
 * (Clazz)表服务接口
 *
 * @author makejava
 * @since 2021-02-07 00:22:53
 */
public interface ClazzService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ClazzDO queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ClazzDO> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    ClazzDO insert(ClazzDO clazz);

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    ClazzDO update(ClazzDO clazz);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}