package si.qi.clazz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bbgg
 * @since 2021-02-07 00:23:51
 */
@Controller
@RequestMapping("/console")
public class PageController {

    @GetMapping("/index")
    public String index() {
        return "index.html";
    }

    @GetMapping("/user/user_operate")
    public String userOperate() {
        return "user/user_operate.html";
    }

    @GetMapping("/user/user_add")
    public String userAdd() {
        return "user/user_add.html";
    }

    @GetMapping("/welcome-1.html")
    public String welcome() {
        return "page/welcome-1.html";
    }

}