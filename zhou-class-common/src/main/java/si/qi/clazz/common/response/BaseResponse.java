package si.qi.clazz.common.response;

import cn.hutool.core.date.DateUtil;
import lombok.Getter;
import lombok.Setter;
import si.qi.clazz.common.enums.BizErrorCodeEnum;
import si.qi.clazz.common.exception.BizException;

/**
 * @description: 通用基础响应
 * @author: guoping
 * @date: 2021/2/17
 */
@Getter
@Setter
public class BaseResponse {

    private Integer page;
    private Integer limit;
    private Long count;

    private Integer code;
    private String msg;

    private Integer serverTime;

    public boolean judgeFailResponse() {
        return this.getCode() != null && !BizErrorCodeEnum.SUCCESS.getCode().equals(this.getCode());
    }

    public BaseResponse buildBaseSuccessRes() {
        this.setCode(BizErrorCodeEnum.SUCCESS.getCode());
        this.setMsg(BizErrorCodeEnum.SUCCESS.getDesc());
        this.setServerTime((int) DateUtil.currentSeconds());
        return this;
    }

    public BaseResponse buildPageSuccessRes(Integer page, Integer limit, Long count) {
        this.setPage(page);
        this.setLimit(limit);
        this.setCount(count);
        return this;
    }

    public static BaseResponse buildErrorRes(BizErrorCodeEnum bizErrorCodeEnum) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(bizErrorCodeEnum.getCode());
        baseResponse.setMsg(bizErrorCodeEnum.getDesc());
        baseResponse.setServerTime((int) DateUtil.currentSeconds());
        return baseResponse;
    }

    public static BaseResponse buildErrorRes(BizException bizException) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(bizException.getErrorCode());
        baseResponse.setMsg(bizException.getErrorMsg());
        baseResponse.setServerTime((int) DateUtil.currentSeconds());
        return baseResponse;
    }

    public static BaseResponse buildErrorRes(Integer code, String msg) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(code);
        baseResponse.setMsg(msg);
        baseResponse.setServerTime((int) DateUtil.currentSeconds());
        return baseResponse;
    }

}
