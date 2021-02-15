package si.qi.clazz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import si.qi.clazz.common.BaseResponse;
import si.qi.clazz.common.BizErrorCodeEnum;
import si.qi.clazz.common.BizException;
import si.qi.clazz.common.PageResult;
import si.qi.clazz.entity.UserInfo;
import si.qi.clazz.model.request.UserPageRequest;
import si.qi.clazz.model.request.UserRequest;
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
    public UserInfo queryByUid(@RequestBody @Valid UserRequest request) {
        return userInfoService.queryByUid(request.getUid());
    }

    @PostMapping("all")
    public PageResult<List<UserInfo>> queryAllUserByPage(@RequestBody @Valid UserPageRequest request) {
        List<UserInfo> userInfos = userInfoService.queryAllByLimit(request.getPage(), request.getSize());
        Integer total = 100;
        return PageResult.<List<UserInfo>>builder()
                .data(userInfos)
                .page(request.getPage())
                .size(request.getSize())
                .total(total)
                .build();
    }

}