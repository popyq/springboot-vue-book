package com.itheima.controller.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author potato
 * @PackageName:com.itheima.controller.utils
 * @Description: TODO
 * @Date 2023-03-24 11:27
 */

//作为springmvc的异常处理器
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {

    // 拦截所有的异常信息
    @ExceptionHandler
    public R doExceptionHandler(Exception ex) {
        // 记录日志
        // 通知运维
        // 通知开发
        ex.printStackTrace();
        return new R("服务器故障,请稍后再试");
    }
}
