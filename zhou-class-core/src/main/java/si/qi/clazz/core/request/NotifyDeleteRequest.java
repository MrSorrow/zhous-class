package si.qi.clazz.core.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.request.BaseRequest;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class NotifyDeleteRequest extends BaseRequest {
    @NotNull(message = "notify id不能为空")
    @Min(value = 0, message = "notify id不能小于0")
    private Long id;
}
