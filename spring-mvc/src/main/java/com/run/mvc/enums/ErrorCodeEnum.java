package com.run.mvc.enums;


import com.run.mvc.common.CfError;

public enum ErrorCodeEnum implements CfError {
	// 系统错误 0开头
	ERROR(0,"系统错误"),
	// 业务错误
	PARAM_ERROR(11,"参数错误"),
	VALIDATION_ERROR(12, "业务规则校验失败"),
	PARSE_ERROR(13, "对象解析错误"),

	// 外部系统错误
	SYS_ERR(101,"依赖系统接口异常"),
	//外部接口反参异常

	//标准错误码
/*
	ERR_12004(12004,"申请人信息不一致"),//合同租房人与注册申请人身份证号、姓名不一致
	ERR_12005(12005,"您已申请过租贝"),//业务系统中相同物业地址有有效订单
	ERR_12006(12006,"暂无有效租赁合同"),//租赁合同不是有效合同
	ERR_12007(12007,"暂无有效租赁合同"),//起租日在当前时间之前
	ERR_12008(12008,"暂无有效租赁合同"),//租赁合同租赁期限不为一年
	ERR_12009(12009,"暂无有效租赁合同"),//地区不为北京
	ERR_12010(12010,"暂无有效租赁合同"),//付款方式不为押一付三
	ERR_15004(15004,"您所选优惠劵已失效"),//查询优惠劵是否有效
	ERR_15005(15005,"您所选优惠劵不适用"),//优惠劵类型是否为单一还款
	ERR_16001(16001,"您有租贝账单未结清，不能进行解约"),//解约失败，有未还款账单
	ERR_16002(16002,"租贝使用中，不能进行解约"),//有正在打款的账单不能解约
*/

	//打款或者还款专项接口
	RE_PAY_UNKNOWN(404,"还款或者打款结果未知"),
	RE_PAY_NOT_EXISTS(401,"打款或者还款查无此单"),
	LR_LOG_ERR(400,"未查询到对应打款流水"),//打款流水状态查询接口用到。未查询到打款流水异常

	ERR_17001(17001,"redis中key已经存在，请勿重复设置"),//redis重复设置key
	RETURN_ERR(500,"接口返回参数异常"),
	REPAYMENT_TYPE_ERR(500,"提前结清账单不支持线下还款");
	
	
	public int errorCode;
	
	public String errorMsg;

	ErrorCodeEnum(int errorCode, String errorMsg){
		this.errorCode = errorCode;
		this.errorMsg = errorMsg; 
	} 
	
	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


}
