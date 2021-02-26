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
public class NotifyAddRequest extends BaseRequest {

    @NotNull(message = "通知类型不能为空")
    private Integer type;
    @NotNull(message = "标题不能为空")
    private String title;
    @NotNull(message = "内容不能为空")
    private String content;
    @NotNull(message = "时间不能为空")
    private Integer time;
    @NotNull(message = "作者id不能为空")
    private Long authorId;
    @NotNull(message = "班级id不能为空")
    private String classIds;

    private Map<String, Object> ext;
}
