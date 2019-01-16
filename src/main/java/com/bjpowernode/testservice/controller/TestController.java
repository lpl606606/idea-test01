package com.bjpowernode.testservice.controller;

import com.bjpowernode.testservice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * className:TestController
 * backpage:com.bjpowernode.testservice.controller
 * user:lpl
 *
 * @author lpl
 * description:
 * date:2019/1/15 19:18
 */
@Controller
public class TestController {

    public TestController() {
        System.out.println(123);
    }

    @Autowired
    private TestService testService;
    @RequestMapping("/hello")
    public @ResponseBody String print(){
        testService.print();
        System.out.println(testService);
        return "hehe";
    }
}
