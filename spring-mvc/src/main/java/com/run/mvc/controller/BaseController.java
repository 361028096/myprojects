package com.run.mvc.controller;

import com.run.mvc.common.ErrorCodeException;
import com.run.mvc.vo.ResponseVo;

public class BaseController {

	public void errorResponse(ResponseVo response, ErrorCodeException e) {
		response.setCode(e.getErrorCode());
		response.setMsg(e.getMessage());
	}
}
