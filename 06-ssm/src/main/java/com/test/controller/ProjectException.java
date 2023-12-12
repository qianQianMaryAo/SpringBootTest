package com.test.controller;

import com.test.exception.BusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ProjectException {
    @ExceptionHandler(BusinessException.class)
    public Result businessException(BusinessException ex) {
        return new Result(ex.getCode(),null,ex.getMessage());
    }


}
