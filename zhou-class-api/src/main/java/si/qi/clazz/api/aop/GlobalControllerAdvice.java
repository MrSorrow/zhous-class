package si.qi.clazz.api.aop;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import si.qi.clazz.common.enums.BizErrorCodeEnum;
import si.qi.clazz.common.exception.BizException;
import si.qi.clazz.common.response.BaseResponse;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
@ResponseBody
@ControllerAdvice
public class GlobalControllerAdvice implements ResponseBodyAdvice<BaseResponse> {

    @ExceptionHandler({BizException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public BaseResponse bizException(BizException e) {
        return BaseResponse.buildErrorRes(e);
    }

    @Override
    public BaseResponse beforeBodyWrite(BaseResponse baseResponse,
                                        MethodParameter returnType,
                                        MediaType selectedContentType,
                                        Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                        ServerHttpRequest request,
                                        ServerHttpResponse response) {
        if (baseResponse == null) {
            return BaseResponse.buildErrorRes(BizErrorCodeEnum.NETWORK_ERROR);
        }
        if (baseResponse.judgeFailResponse()) {
            return baseResponse;
        }
        return baseResponse.buildBaseSuccessRes();
    }

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }
}
