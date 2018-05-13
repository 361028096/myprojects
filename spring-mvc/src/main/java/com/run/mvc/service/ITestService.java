package com.run.mvc.service;


import com.run.mvc.common.ErrorCodeException;
import com.run.mvc.dao.model.Test;

/**
 * @author : hewei
 * @date : 2018/1/24
 */
public interface ITestService {

    void InsertTest() throws Exception;

    public Test selectTest();

    public void getErrorCodeException() throws ErrorCodeException;

    public void exportXml(String[] titles) throws Exception;

    public void exportXmlx(String[] titles) throws Exception;

    public void exportXmlxFromTemple() throws Exception;


}
