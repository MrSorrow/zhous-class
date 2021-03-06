package si.qi.clazz.core.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.response.BaseResponse;
import si.qi.clazz.core.vo.ClazzVO;

import java.util.List;

/**
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class ClazzAddResponse extends BaseResponse {
    private ClazzVO clazzInfo;
}
