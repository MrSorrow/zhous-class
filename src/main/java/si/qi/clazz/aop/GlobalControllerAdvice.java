package si.qi.clazz.aop;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import si.qi.clazz.common.BaseResponse;
import si.qi.clazz.common.BizException;
import si.qi.clazz.common.PageResult;

/**
 * @description:
 * @author: guoping
 * @date: 2021/2/15
 */
@ResponseBody
@ControllerAdvice
public class GlobalControllerAdvice implements ResponseBodyAdvice {

    @ExceptionHandler({BizException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public BaseResponse bizException(BizException e) {
        return BaseResponse.fail(e);
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (body instanceof PageResult) {
            PageResult pageResult = (PageResult) body;
            return BaseResponse.successWithPage(pageResult.getData(), pageResult.getPage(), pageResult.getSize(), pageResult.getTotal());
        } else if (body instanceof BaseResponse) {
            return body;
        }
        return BaseResponse.success(body);
    }

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }
}
