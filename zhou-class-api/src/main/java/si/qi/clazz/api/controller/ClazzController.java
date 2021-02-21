package si.qi.clazz.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import si.qi.clazz.core.request.*;
import si.qi.clazz.core.response.*;
import si.qi.clazz.core.service.ClazzService;

import javax.validation.Valid;

/**
 * @author bbgg
 * @since 2021-02-07 00:23:51
 */
@RestController
@RequestMapping("/console/api/class/")
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @PostMapping("all")
    public ClazzQueryResponse queryByCondition(@RequestBody @Valid ClazzQueryRequest request) {
        return clazzService.queryByCondition(request);
    }

    @PostMapping("add")
    public ClazzAddResponse addClazz(@RequestBody @Valid ClazzAddRequest request) {
        return clazzService.insert(request);
    }

    @PostMapping("update")
    public ClazzUpdateResponse updateUser(@RequestBody @Valid ClazzUpdateRequest request) {
        return clazzService.update(request);
    }

    @PostMapping("delete")
    public ClazzDeleteResponse deleteUser(@RequestBody @Valid ClazzDeleteRequest request) {
        return clazzService.deleteById(request);
    }
}