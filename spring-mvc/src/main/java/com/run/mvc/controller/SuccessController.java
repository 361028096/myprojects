package com.run.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hewei
 * @description TODO
 * @date 2018/6/20
 */
@RestController
public class SuccessController {

    @RequestMapping(value = "/success")
    public void test1(HttpServletRequest request) {
        System.out.println("hewei success");

    }
}
