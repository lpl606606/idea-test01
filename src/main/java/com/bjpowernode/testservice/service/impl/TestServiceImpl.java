package com.bjpowernode.testservice.service.impl;

import com.bjpowernode.testservice.service.TestService;
import org.springframework.stereotype.Service;

/**
 * className:TestServiceImpl
 * backpage:com.bjpowernode.testservice.service.impl
 * user:lpl
 *
 * @author lpl
 * description:
 * date:2019/1/15 19:17
 */
@Service
public class TestServiceImpl implements TestService {
    public TestServiceImpl() {
        System.out.println("testServiceImpl");
    }

    public void print() {
        System.out.println("测试自动注入是否成功……");
    }
}
