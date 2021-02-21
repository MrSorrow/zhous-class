package si.qi.clazz.core.service;

import si.qi.clazz.core.request.ClazzAddRequest;
import si.qi.clazz.core.request.ClazzDeleteRequest;
import si.qi.clazz.core.request.ClazzQueryRequest;
import si.qi.clazz.core.request.ClazzUpdateRequest;
import si.qi.clazz.core.response.ClazzAddResponse;
import si.qi.clazz.core.response.ClazzDeleteResponse;
import si.qi.clazz.core.response.ClazzQueryResponse;
import si.qi.clazz.core.response.ClazzUpdateResponse;

/**
 * (Clazz)表服务接口
 *
 * @author makejava
 * @since 2021-02-07 00:22:53
 */
public interface ClazzService {

    ClazzQueryResponse queryByCondition(ClazzQueryRequest request);

    ClazzAddResponse insert(ClazzAddRequest request);

    ClazzUpdateResponse update(ClazzUpdateRequest request);

    ClazzDeleteResponse deleteById(ClazzDeleteRequest request);
}