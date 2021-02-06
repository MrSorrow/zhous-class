package si.qi.clazz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import si.qi.clazz.entity.Notify;
import si.qi.clazz.service.NotifyService;

import javax.annotation.Resource;

/**
 * (Notify)表控制层
 *
 * @author makejava
 * @since 2021-02-07 00:23:14
 */
@RestController
@RequestMapping("notify")
public class NotifyController {
    /**
     * 服务对象
     */
    @Resource
    private NotifyService notifyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Notify selectOne(Long id) {
        return this.notifyService.queryById(id);
    }

}