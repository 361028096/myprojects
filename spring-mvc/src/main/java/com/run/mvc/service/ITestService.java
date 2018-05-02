package com.run.mvc.service;


import com.run.mvc.dao.model.Test;

/**
 * @author : hewei
 * @date : 2018/1/24
 */
public interface ITestService {

    void InsertTest() throws Exception;

    public Test selectTest();

}
