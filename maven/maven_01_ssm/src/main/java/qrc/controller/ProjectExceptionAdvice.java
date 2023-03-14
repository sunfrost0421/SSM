package qrc.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import qrc.exception.BusinessException;
import qrc.exception.SystemException;

//声明该类做异常处理
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //@ExceptionHandler声明异常种类

    //处理系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //记录日志
        //发消息给运维，发邮件给开发人员
        //安抚用户
        System.out.println("处理系统异常");
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    //处理业务异常
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        //提示用户按照规范操作
        System.out.println("处理业务异常");
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    //处理业务异常
    @ExceptionHandler(Exception.class)
    public Result doBusinessException(Exception ex){
        //记录日志
        //发消息给运维，发邮件给开发人员
        //安抚用户
        System.out.println("处理未知异常");
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统出现未知错误，请重试!");
    }
}
