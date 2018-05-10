package com.run.mvc.controller;

import com.run.mvc.dto.TestDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : hewei
 * @description: TODO
 * @date : 2018/5/2
 */
@Controller
@RequestMapping(value = "/hello")
public class TestController {
    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String printHello(@RequestParam(value = "getString") String getString, HttpServletRequest request, ModelMap model) {
        System.out.println(getString);
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "get hello2 hewei");
        return "hello2";
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.POST)
    public String printHello2(HttpServletRequest request, ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "post hello2 hewei");
        return "hello2";
    }

    @RequestMapping(value = "/hello3",method = RequestMethod.GET)
    public String printHello3(@RequestBody TestDto testDto, HttpServletRequest request, ModelMap model) {
        System.out.println(testDto.getGetString());
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "get hello2 hewei");
        return "hello2";
    }

}
