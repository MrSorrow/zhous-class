package si.qi.clazz.common;

import cn.hutool.core.date.DateUtil;
import lombok.Getter;

/**
 * @author: bbgg
 * @date: 2021/2/15
 */
@Getter
public class BaseResponse<T> {


    private T data;
    private Integer page;
    private Integer size;
    private Integer total;

    private Integer errorCode;
    private String errorMsg;

    private Integer serverTime;

    private static final Integer SUCCESS_CODE = 200;

    protected BaseResponse(T data, Integer page, Integer size, Integer total, Integer errorCode, String errorMsg, Integer serverTime) {
        this.data = data;
        this.page = page;
        this.size = size;
        this.total = total;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.serverTime = serverTime;
    }

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<T>(data, null, null, null, SUCCESS_CODE, null, (int) DateUtil.currentSeconds());
    }

    public static <T> BaseResponse<T> successWithPage(T data, Integer page, Integer size, Integer total) {
        return new BaseResponse<T>(data, page, size, total, SUCCESS_CODE, null, (int) DateUtil.currentSeconds());
    }

    public static <T> BaseResponse<T> fail(BizErrorCodeEnum codeEnum) {
        return fail(codeEnum.getCode(), codeEnum.getDesc());
    }

    public static <T> BaseResponse<T> fail(BizException e) {
        return fail(e.getErrorCode(), e.getErrorMsg());
    }

    public static <T> BaseResponse<T> fail(Integer code, String msg) {
        return new BaseResponse<T>(null, null, null, null, code, msg, (int) DateUtil.currentSeconds());
    }
}
