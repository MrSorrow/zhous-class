package si.qi.clazz.core.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import si.qi.clazz.common.response.BaseResponse;
import si.qi.clazz.core.vo.ClazzVO;
import si.qi.clazz.core.vo.UserInfoVO;

import java.util.List;

/**
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@ToString
public class ClazzQueryResponse extends BaseResponse {
    private List<ClazzVO> clazzList;
}
