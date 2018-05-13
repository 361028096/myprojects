package com.run.mvc.constant;

import java.io.Serializable;

/**
 * @author yunlang 2017年11月23日19:35:57
 * 各种常量
 */
public class Const implements Serializable {
    /**
     * 事件状态：成功
     */
    public static final Integer RESPONSE_OK = 200;

    /**
     * 事件状态：异常
     */
    public static final Integer RESPONSE_ERR = 500;

    public static final String SUCCESS = "SUCCESS";

    public static final String FAILURE = "FAILURE";
}
