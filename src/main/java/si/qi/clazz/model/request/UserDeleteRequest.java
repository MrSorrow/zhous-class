package si.qi.clazz.model.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
public class UserDeleteRequest {
    @NotNull(message = "uid不能为空")
    @Min(value = 0, message = "uid不能小于0")
    private Long uid;
}
