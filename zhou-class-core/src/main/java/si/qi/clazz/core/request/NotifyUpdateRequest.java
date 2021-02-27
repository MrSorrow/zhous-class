package si.qi.clazz.core.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.request.BaseRequest;

import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class NotifyUpdateRequest extends BaseRequest {
    @NotNull(message = "notify id不能为空")
    private Long id;
    private Integer type;
    private String title;
    private String content;
    private Integer time;
    private Long authorId;
    private String classIds;

    private Map<String, Object> ext;
}
