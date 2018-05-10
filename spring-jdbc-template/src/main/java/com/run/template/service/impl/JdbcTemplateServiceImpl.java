package com.run.template.service.impl;

import com.run.template.dao.model.Test;
import com.run.template.service.IJdbcTemplateService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Types;
import java.util.List;
import java.util.Map;

/**
 * @author : hewei
 * @description: TODO
 * @date : 2018/5/2
 */
@Service
public class JdbcTemplateServiceImpl implements IJdbcTemplateService {

    @Resource
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Test> findAllTest() {
        String sql="select * from test";
        List<Map<String,Object>> testList = jdbcTemplate.queryForList(sql);
        System.out.println(testList);
        return null;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void saveTest1(Test test) {
        String sql = "insert into test(id,name) values(?,?)";
        jdbcTemplate.update(sql,
                new Object[]{test.getId(),test.getName()},
                new int[]{Types.VARCHAR,Types.VARCHAR});
        System.out.println("test1 finish!");
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void saveTest2(Test test) {
        String sql = "insert into test(id,name) values(?,?)";
        jdbcTemplate.update(sql,
                new Object[]{test.getId(),test.getName()},
                new int[]{Types.VARCHAR,Types.VARCHAR});
        throw new RuntimeException("test2 FAIL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void saveTest1AndTest2(Test test1, Test test2) {
        saveTest1(test1);
        saveTest2(test2);
    }
}
