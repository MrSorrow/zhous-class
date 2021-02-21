package si.qi.clazz.core.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.response.BaseResponse;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class UserDeleteResponse extends BaseResponse {
    private Boolean success;
}
