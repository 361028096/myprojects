package com.run.mvc.common;

/**
 * @author hongbin
 * 异常处理
 */
public class ErrorCodeException extends Exception{

	private static final long serialVersionUID = 1L;

	private int errorCode;

	public ErrorCodeException() {
		super();
	}

	public ErrorCodeException(CfError error) {
		super(error.getErrorMsg());
		errroMsg(error);
	}

	public ErrorCodeException(CfError error,String errorMessage) {
		super(error.getErrorMsg()+","+errorMessage);
		errroMsg(error);
	}

	public ErrorCodeException(CfError error,Throwable e) {
		super(error.getErrorMsg(),e);
		errroMsg(error);
	}
	
	public ErrorCodeException(String errorMessage) {
		super(errorMessage);
	}
	
	private void errroMsg(CfError error){
		this.errorCode = error.getErrorCode();
	}


	public int getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}


}
