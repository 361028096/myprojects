package com.run.template.service;


import com.run.template.dao.model.Test;

/**
 * @author : hewei
 * @date : 2018/1/24
 */
public interface ITestService {

    void InsertTest() throws Exception;

    public Test selectTest();

}
