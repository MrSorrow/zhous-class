package si.qi.clazz.core.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.request.BaseRequest;

/**
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class NotifyQueryRequest extends BaseRequest {
    private Long id;
    private Integer type;
    private String title;
    private String content;
    private Integer time;
    private Long authorId;
    private String classIds;
}
