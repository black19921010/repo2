package com.sunday.dianshang.handler;

import com.sunday.dianshang.entity.BaseResponse;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Sunday
 * @date 2020/6/18
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @InitBinder
    public void initBinder(WebDataBinder binder) {

    }

    @ExceptionHandler(Exception.class)
    public BaseResponse globalExceptionHandler(Exception e) {
        return new BaseResponse(9999, e.getMessage(), null);
    }
}
