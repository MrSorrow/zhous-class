package si.qi.clazz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import si.qi.clazz.entity.Clazz;
import si.qi.clazz.service.ClazzService;

import javax.annotation.Resource;

/**
 * (Clazz)表控制层
 *
 * @author makejava
 * @since 2021-02-07 00:22:54
 */
@RestController
@RequestMapping("clazz")
public class ClazzController {
    /**
     * 服务对象
     */
    @Resource
    private ClazzService clazzService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Clazz selectOne(Long id) {
        return this.clazzService.queryById(id);
    }

}