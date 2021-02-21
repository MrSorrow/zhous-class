package si.qi.clazz.common.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: guoping
 * @date: 2021/2/17
 */
@Getter
@Setter
@ToString
public class BaseRequest {
    private Integer page = 1;
    private Integer limit = 5;
}
