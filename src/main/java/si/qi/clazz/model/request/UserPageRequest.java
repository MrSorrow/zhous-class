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
public class UserPageRequest {
    @NotNull(message = "page不能为空")
    @Min(value = 0, message = "page不能小于0")
    private Integer page;
    @NotNull(message = "size不能为空")
    @Min(value = 0, message = "size不能小于0")
    private Integer size;
}
