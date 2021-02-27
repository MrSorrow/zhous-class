package si.qi.clazz.core.service;

import si.qi.clazz.core.request.UserAddRequest;
import si.qi.clazz.core.request.UserDeleteRequest;
import si.qi.clazz.core.request.UserQueryRequest;
import si.qi.clazz.core.request.UserUpdateRequest;
import si.qi.clazz.core.response.*;

/**
 * @author bbgg
 * @since 2021-02-07 00:23:51
 */
public interface UserInfoService {

    UserQueryResponse queryByCondition(UserQueryRequest request);

    UserAddResponse insert(UserAddRequest request);

    UserUpdateResponse update(UserUpdateRequest request);

    UserDeleteResponse deleteByUid(UserDeleteRequest request);
}