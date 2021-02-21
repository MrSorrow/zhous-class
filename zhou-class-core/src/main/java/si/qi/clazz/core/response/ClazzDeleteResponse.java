package si.qi.clazz.core.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.response.BaseResponse;

/**
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class ClazzDeleteResponse extends BaseResponse {
    private Boolean success;
}
