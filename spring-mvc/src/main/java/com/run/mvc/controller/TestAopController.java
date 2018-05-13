package com.run.mvc.controller;

import com.run.mvc.common.ErrorCodeException;
import com.run.mvc.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/10
 */
@RestController
public class TestAopController {

    private final Logger logger = LoggerFactory.getLogger(TestAopController.class);

    @Autowired
    private ITestService testService;
//    @ExceptionHandler
    @RequestMapping(value = "/test1")
    public String test1(HttpServletRequest request, ModelMap model) {
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "test1 aop");
        throw new RuntimeException("测试异常");
//        return "hello2";
    }

    @RequestMapping(value = "/test2")
    public String test2(HttpServletRequest request,ModelMap model) {
        try {
            testService.getErrorCodeException();
        } catch (ErrorCodeException e) {
            logger.error("错误log.error");
//            e.printStackTrace();

        } catch (RuntimeException e) {
            logger.error("捕获runTimeException",e);
        }
        System.out.println("错误");
        return "hello2";
    }

    @RequestMapping(value = "test3")
    public String test3(HttpServletRequest request,ModelMap model){
        System.out.println(testService.selectTest());
        return "hello2";
    }


}
