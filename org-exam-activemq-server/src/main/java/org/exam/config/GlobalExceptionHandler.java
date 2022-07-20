package org.exam.config;

import org.exam.common.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

@RestControllerAdvice(basePackages = "org.exam.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler
    public Result handleException(final Exception e){
        if (e instanceof SQLException){
            return Result.fail("fail","发生数据库异常");
        }
        if (e instanceof NullPointerException){
            return Result.fail("fail","发生空指针异常");
        }
        if (e instanceof ArithmeticException){
            return Result.fail("fail","发生除数为0的异常");
        }

        return Result.fail("fail","发生异常");
    }
}
