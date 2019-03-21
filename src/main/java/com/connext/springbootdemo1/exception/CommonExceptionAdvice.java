package com.connext.springbootdemo1.exception;

import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Chuckie
 * @Description
 * @date 19-3-21
 */


@ControllerAdvice
@ResponseBody
public class CommonExceptionAdvice {

    private static Logger logger = LoggerFactory.getLogger(CommonExceptionAdvice.class);

}
