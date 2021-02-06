package si.qi.clazz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import si.qi.clazz.entity.UserInfo;
import si.qi.clazz.service.UserInfoService;

import javax.annotation.Resource;

/**
 * (UserInfo)表控制层
 *
 * @author makejava
 * @since 2021-02-07 00:23:51
 */
@RestController
@RequestMapping("userInfo")
public class UserInfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserInfoService userInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserInfo selectOne(Long id) {
        return this.userInfoService.queryById(id);
    }

}