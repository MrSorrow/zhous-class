package si.qi.clazz.core.service;

import si.qi.clazz.domain.db.model.NotifyDO;

import java.util.List;

/**
 * (Notify)表服务接口
 *
 * @author makejava
 * @since 2021-02-07 00:23:14
 */
public interface NotifyService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NotifyDO queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NotifyDO> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param notify 实例对象
     * @return 实例对象
     */
    NotifyDO insert(NotifyDO notify);

    /**
     * 修改数据
     *
     * @param notify 实例对象
     * @return 实例对象
     */
    NotifyDO update(NotifyDO notify);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}