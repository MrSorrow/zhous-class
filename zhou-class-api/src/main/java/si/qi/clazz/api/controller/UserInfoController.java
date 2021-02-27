package si.qi.clazz.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import si.qi.clazz.core.request.*;
import si.qi.clazz.core.response.UserAddResponse;
import si.qi.clazz.core.response.UserDeleteResponse;
import si.qi.clazz.core.response.UserQueryResponse;
import si.qi.clazz.core.response.UserUpdateResponse;
import si.qi.clazz.core.service.UserInfoService;

import javax.validation.Valid;

/**
 * @author bbgg
 * @since 2021-02-07 00:23:51
 */
@RestController
@RequestMapping("/console/api/user/")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("all")
    public UserQueryResponse queryUserByCondition(@RequestBody @Valid UserQueryRequest request) {
        return userInfoService.queryByCondition(request);
    }

    @PostMapping("add")
    public UserAddResponse addUser(@RequestBody @Valid UserAddRequest request) {
        return userInfoService.insert(request);
    }

    @PostMapping("update")
    public UserUpdateResponse updateUser(@RequestBody @Valid UserUpdateRequest request) {
        return userInfoService.update(request);
    }

    @PostMapping("delete")
    public UserDeleteResponse deleteUser(@RequestBody @Valid UserDeleteRequest request) {
        return userInfoService.deleteByUid(request);
    }

}