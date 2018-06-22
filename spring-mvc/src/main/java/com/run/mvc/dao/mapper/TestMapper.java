package com.run.mvc.dao.mapper;

import com.run.mvc.dao.model.Test;
import com.run.mvc.dao.model.TestExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TestMapper {
    long countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int deleteByPrimaryKey(String id);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExampleWithRowbounds(TestExample example, RowBounds rowBounds);

    List<Test> selectByExample(TestExample example);

    Test selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);

    Test selectById(String id);
}