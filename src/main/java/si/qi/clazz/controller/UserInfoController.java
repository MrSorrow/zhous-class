package si.qi.clazz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import si.qi.clazz.common.PageResult;
import si.qi.clazz.entity.UserInfo;
import si.qi.clazz.model.request.*;
import si.qi.clazz.model.response.*;
import si.qi.clazz.service.UserInfoService;

import javax.validation.Valid;
import java.util.List;

/**
 * @author bbgg
 * @since 2021-02-07 00:23:51
 */
@RestController
@RequestMapping("/console/api/user/")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("uid")
    public UserResponse queryByUid(@RequestBody @Valid UserRequest request) {
        return userInfoService.queryByUid(request.getUid());
    }

    @PostMapping("all")
    public PageResult queryAllUserByPage(@RequestBody @Valid UserPageRequest request) {
        return userInfoService.queryAllByLimit(request.getPage(), request.getLimit()).getUserInfos();
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