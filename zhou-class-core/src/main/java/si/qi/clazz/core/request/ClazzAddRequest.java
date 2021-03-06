package si.qi.clazz.core.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.request.BaseRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class ClazzAddRequest extends BaseRequest {

    @NotNull(message = "学校名称不能为空")
    private String schoolName;
    @NotNull(message = "年级不能为空")
    private Integer grade;
    @NotNull(message = "班级不能为空")
    private Integer classNumber;

    private Map<String, Object> ext;
}
