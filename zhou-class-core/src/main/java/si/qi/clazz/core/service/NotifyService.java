package si.qi.clazz.core.service;

import si.qi.clazz.core.request.NotifyAddRequest;
import si.qi.clazz.core.request.NotifyDeleteRequest;
import si.qi.clazz.core.request.NotifyQueryRequest;
import si.qi.clazz.core.request.NotifyUpdateRequest;
import si.qi.clazz.core.response.NotifyAddResponse;
import si.qi.clazz.core.response.NotifyDeleteResponse;
import si.qi.clazz.core.response.NotifyQueryResponse;
import si.qi.clazz.core.response.NotifyUpdateResponse;

/**
 * @author makejava
 * @since 2021-02-07 00:23:14
 */
public interface NotifyService {

    NotifyQueryResponse queryByCondition(NotifyQueryRequest request);

    NotifyAddResponse insert(NotifyAddRequest request);

    NotifyUpdateResponse update(NotifyUpdateRequest request);

    NotifyDeleteResponse deleteById(NotifyDeleteRequest request);
}