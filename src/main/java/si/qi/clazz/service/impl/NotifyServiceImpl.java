package si.qi.clazz.service.impl;

import org.springframework.stereotype.Service;
import si.qi.clazz.dao.NotifyDao;
import si.qi.clazz.entity.Notify;
import si.qi.clazz.service.NotifyService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Notify)表服务实现类
 *
 * @author makejava
 * @since 2021-02-07 00:23:14
 */
@Service("notifyService")
public class NotifyServiceImpl implements NotifyService {
    @Resource
    private NotifyDao notifyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Notify queryById(Long id) {
        return this.notifyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Notify> queryAllByLimit(int offset, int limit) {
        return this.notifyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param notify 实例对象
     * @return 实例对象
     */
    @Override
    public Notify insert(Notify notify) {
        this.notifyDao.insert(notify);
        return notify;
    }

    /**
     * 修改数据
     *
     * @param notify 实例对象
     * @return 实例对象
     */
    @Override
    public Notify update(Notify notify) {
        this.notifyDao.update(notify);
        return this.queryById(notify.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.notifyDao.deleteById(id) > 0;
    }
}