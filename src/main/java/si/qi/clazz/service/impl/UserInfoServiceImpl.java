package si.qi.clazz.service.impl;

import org.springframework.stereotype.Service;
import si.qi.clazz.dao.UserInfoDao;
import si.qi.clazz.entity.UserInfo;
import si.qi.clazz.service.UserInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-02-07 00:23:51
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    /**
     * 通过UID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public UserInfo queryByUid(Long uid) {
        return this.userInfoDao.queryByUid(uid);
    }

    /**
     * 查询多条数据
     *
     * @param page 页数
     * @param size  条数
     * @return 对象列表
     */
    @Override
    public List<UserInfo> queryAllByLimit(int page, int size) {
        return this.userInfoDao.queryAllByLimit(page * size, size);
    }

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfo insert(UserInfo userInfo) {
        this.userInfoDao.insert(userInfo);
        return userInfo;
    }

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfo update(UserInfo userInfo) {
        this.userInfoDao.update(userInfo);
        return this.queryByUid(userInfo.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userInfoDao.deleteById(id) > 0;
    }
}