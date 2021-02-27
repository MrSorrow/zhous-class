package si.qi.clazz.core.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.request.BaseRequest;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class UserQueryRequest extends BaseRequest {
    private Long id;
    private Long uid;
    private String wechatName;
    private String nickName;
    private Integer role;
    private String phone;
    private String classes;
}
