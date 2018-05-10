package com.run.template.service;

import com.run.template.dao.model.Test;

import java.util.List;

/**
 * @author : hewei
 * @description: TODO
 * @date : 2018/5/2
 */
public interface IJdbcTemplateService {

    public List<Test> findAllTest();

    public void saveTest1(Test test);

    public void saveTest2(Test test);

    public void saveTest1AndTest2(Test test1,Test test2);
}
