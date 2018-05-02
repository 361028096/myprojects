package com.run.mvc.service.impl;


import com.run.mvc.dao.mapper.TestMapper;
import com.run.mvc.dao.model.Test;
import com.run.mvc.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : hewei
 * @date : 2018/1/24
 */
@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public void InsertTest() throws Exception {

    }

    @Override
    public Test selectTest() {
        System.out.println("get test...");
        Test test = getTest();
        return test;
    }

    private Test getTest() {
        Test test = testMapper.selectByPrimaryKey("1");
        System.out.println(test);
        return test;
    }
}
