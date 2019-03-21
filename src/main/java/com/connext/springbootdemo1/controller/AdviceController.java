package com.connext.springbootdemo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chuckie
 * @Description
 * @date 19-3-21
 */
@RestController
public class AdviceController {

    @RequestMapping("/hello1")
    public String hello1() {
        int i = 1 / 0;
        return "hello";
    }

}
