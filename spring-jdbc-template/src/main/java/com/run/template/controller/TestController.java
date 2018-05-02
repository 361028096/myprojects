package com.run.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : hewei
 * @description: TODO
 * @date : 2018/5/2
 */
@Controller
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public class TestController {
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String printHello(HttpServletRequest request, ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "hewei");
        return "hello2";
    }

}
