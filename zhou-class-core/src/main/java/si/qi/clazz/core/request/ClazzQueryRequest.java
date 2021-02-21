package si.qi.clazz.core.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.request.BaseRequest;

import java.util.Date;

/**
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class ClazzQueryRequest extends BaseRequest {
    private Long id;
    private String schoolName;
    private Integer grade;
    private Integer classNumber;
}
