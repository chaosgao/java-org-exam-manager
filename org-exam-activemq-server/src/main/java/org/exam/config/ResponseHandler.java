//package org.exam.config;
//
//import org.exam.common.Result;
//import org.springframework.core.MethodParameter;
//import org.springframework.http.MediaType;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
//
//@RestControllerAdvice(basePackages = "org.exam.controller")
//public class ResponseHandler implements ResponseBodyAdvice {
//    /**
//     *
//     * @param returnType
//     * @param converterType
//     * @return 是否支持advice功能  true = 支持， false = 不支持
//     */
//    @Override
//    public boolean supports(MethodParameter returnType, Class converterType) {
//        return true;
//    }
//
//    @Override
//    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
//
//        return Result.ok(body);
//    }
//}
