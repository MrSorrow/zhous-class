package si.qi.clazz.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import si.qi.clazz.common.enums.BizErrorCodeEnum;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BizException extends RuntimeException {
    private Integer errorCode;
    private String errorMsg;

    public BizException(BizErrorCodeEnum codeEnum) {
        errorCode = codeEnum.getCode();
        errorMsg = codeEnum.getDesc();
    }
}
