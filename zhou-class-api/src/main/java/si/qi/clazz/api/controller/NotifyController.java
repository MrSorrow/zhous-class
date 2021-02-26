package si.qi.clazz.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import si.qi.clazz.core.request.ClazzAddRequest;
import si.qi.clazz.core.request.ClazzDeleteRequest;
import si.qi.clazz.core.request.ClazzQueryRequest;
import si.qi.clazz.core.request.ClazzUpdateRequest;
import si.qi.clazz.core.request.NotifyAddRequest;
import si.qi.clazz.core.request.NotifyDeleteRequest;
import si.qi.clazz.core.request.NotifyQueryRequest;
import si.qi.clazz.core.request.NotifyUpdateRequest;
import si.qi.clazz.core.response.ClazzAddResponse;
import si.qi.clazz.core.response.ClazzDeleteResponse;
import si.qi.clazz.core.response.ClazzQueryResponse;
import si.qi.clazz.core.response.ClazzUpdateResponse;
import si.qi.clazz.core.response.NotifyAddResponse;
import si.qi.clazz.core.response.NotifyDeleteResponse;
import si.qi.clazz.core.response.NotifyQueryResponse;
import si.qi.clazz.core.response.NotifyUpdateResponse;
import si.qi.clazz.core.service.NotifyService;
import si.qi.clazz.domain.db.model.NotifyDO;

import javax.validation.Valid;

/**
 * 通知管理
 *
 * @author bbgg
 * @since 2021-02-07 00:23:14
 */
@RestController
@RequestMapping("/console/api/notify/")
public class NotifyController {

    @Autowired
    private NotifyService notifyService;

    @PostMapping("all")
    public NotifyQueryResponse queryByCondition(@RequestBody @Valid NotifyQueryRequest request) {
        return notifyService.queryByCondition(request);
    }

    @PostMapping("add")
    public NotifyAddResponse addNotify(@RequestBody @Valid NotifyAddRequest request) {
        return notifyService.insert(request);
    }

    @PostMapping("update")
    public NotifyUpdateResponse updateUser(@RequestBody @Valid NotifyUpdateRequest request) {
        return notifyService.update(request);
    }

    @PostMapping("delete")
    public NotifyDeleteResponse deleteUser(@RequestBody @Valid NotifyDeleteRequest request) {
        return notifyService.deleteById(request);
    }

}