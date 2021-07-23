package org.aw.play.userserver.config;


import base.DataResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author Irvin
 * @className GlobalExceptionHandler
 * @description
 * @date 2020/4/16 0016 10:54
 **/
@RestControllerAdvice(annotations = {RestController.class})
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 默认统一异常处理方法
     *
     * @ExceptionHandler 注解用来配置需要拦截的异常类型, 也可以是自定义异常
     */
    @ExceptionHandler(Exception.class)
    // 此处可以指定返回的状态码 和 返回 结果说明
    // @ResponseStatus(reason = "exception",value = HttpStatus.BAD_REQUEST)
    public DataResult<Object> runtimeExceptionHandler(Exception e) {
        // 打印异常信息到控制台
        e.printStackTrace();
        log.error("请求出现异常,异常信息为: ", e);
        // 使用公共的结果类封装返回结果, 这里我指定状态码为 400
        return new DataResult<>(0, 500, null, "程序异常");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public DataResult<Object> handleBindException(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        assert fieldError != null;
        log.info("参数校验异常:{}({})", fieldError.getDefaultMessage(), fieldError.getField());
        return new DataResult<>(0, 400, null, "参数不合法" + fieldError.getDefaultMessage() + ";" + fieldError.getField());
    }

    @ExceptionHandler(BindException.class)
    public DataResult<Object> handleBindException(BindException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        assert fieldError != null;
        log.info("参数校验异常:{}({})", fieldError.getDefaultMessage(), fieldError.getField());
        return new DataResult<>(0, 400, null, "参数不合法" + fieldError.getDefaultMessage() + ";" + fieldError.getField());    }

}
