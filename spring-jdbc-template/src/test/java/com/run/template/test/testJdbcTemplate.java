package com.run.template.test;

import com.run.template.service.IJdbcTemplateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mvel2.MVEL;
import org.mvel2.compiler.CompiledExpression;
import org.mvel2.compiler.ExpressionCompiler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : hewei
 * @description: TODO
 * @date : 2018/5/2
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/applicationContext.xml"})
public class testJdbcTemplate {

    private static final Logger log = LoggerFactory.getLogger(testJdbcTemplate.class);

    @Resource
    private IJdbcTemplateService jdbcTemplateService;

    @Test
    public void testJdbcTemplate() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        // 创建JDBC模板
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 这里也可以使用构造方法
        jdbcTemplate.setDataSource(dataSource);

        // sql语句
        String sql = "select count(*)  from test";
        Long num = (long) jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println(num);
    }

    @Test
    public void testJdbcTemplateService() {
        jdbcTemplateService.findAllTest();
    }

    @Test
    public void testMVEL() {
        Map vars = new HashMap<>();
        vars.put("k1","v1");
        CompiledExpression expression = new ExpressionCompiler("k1 == 'v1'").compile();
        Boolean result = MVEL.executeExpression(expression, vars, Boolean.class);
        System.out.println(result);
    }

    @Test
    public void testLog() {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        log.info("a:{},b:{},c:{}",a,b,c);
    }

    @Test
    public void testJdbcTemplateSave() {
        com.run.template.dao.model.Test test1 = new com.run.template.dao.model.Test();
        test1.setId("6");
        test1.setName("6");
        jdbcTemplateService.saveTest1(test1);

        com.run.template.dao.model.Test test2 = new com.run.template.dao.model.Test();
        test2.setId("7");
        test2.setName("7");
        jdbcTemplateService.saveTest2(test2);
    }

    @Test
    public void testJdbcTemplateSaveTest1AndTest2() {
        com.run.template.dao.model.Test test1 = new com.run.template.dao.model.Test();
        test1.setId("6");
        test1.setName("6");

        com.run.template.dao.model.Test test2 = new com.run.template.dao.model.Test();
        test2.setId("7");
        test2.setName("7");

        jdbcTemplateService.saveTest1AndTest2(test1,test2);
    }
}
