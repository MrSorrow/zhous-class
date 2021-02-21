package si.qi.clazz.core.service.impl;

import org.springframework.stereotype.Service;
import si.qi.clazz.repo.db.ClazzDao;
import si.qi.clazz.domain.db.model.ClazzDO;
import si.qi.clazz.core.service.ClazzService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Clazz)表服务实现类
 *
 * @author makejava
 * @since 2021-02-07 00:22:53
 */
@Service("clazzService")
public class ClazzServiceImpl implements ClazzService {
    @Resource
    private ClazzDao clazzDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ClazzDO queryById(Long id) {
        return this.clazzDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ClazzDO> queryAllByLimit(int offset, int limit) {
        return this.clazzDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    @Override
    public ClazzDO insert(ClazzDO clazz) {
        this.clazzDao.insert(clazz);
        return clazz;
    }

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 实例对象
     */
    @Override
    public ClazzDO update(ClazzDO clazz) {
        this.clazzDao.update(clazz);
        return this.queryById(clazz.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.clazzDao.deleteById(id) > 0;
    }
}