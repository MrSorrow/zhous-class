package si.qi.clazz.common;

import lombok.Builder;
import lombok.Getter;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
@Builder
@Getter
public class PageResult<T> {
    private T data;
    private Integer page;
    private Integer size;
    private Integer total;
}
