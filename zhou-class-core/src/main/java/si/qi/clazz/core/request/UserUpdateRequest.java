package si.qi.clazz.core.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.request.BaseRequest;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class UserUpdateRequest extends BaseRequest {
    @NotNull(message = "uid不能为空")
    @Min(value = 0, message = "uid不能小于0")
    private Long uid;

    private String nickName;
    private String phone;
    private String password;
    private List<Integer> classes;
    private List<Integer> roles;
}
