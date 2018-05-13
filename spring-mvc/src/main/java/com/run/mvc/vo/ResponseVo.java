package com.run.mvc.vo;

import java.io.Serializable;

public class ResponseVo<T> implements Serializable {
	
	private int code = 200; //200成功，其他失败
	
	private String msg;
	
	private T data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
