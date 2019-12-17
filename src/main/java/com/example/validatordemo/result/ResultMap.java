package com.example.validatordemo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/***
 * 勿动&勿改
 */
//value–表示对象名 
//description–描述 
@ApiModel(value="ResultMap",description="响应数据模型")
public class ResultMap<T> implements Serializable {

	private static final long serialVersionUID = -9051523219661560886L;
	
//	value–字段说明 
//	name–重写属性名字 
//	dataType–重写属性类型 
//	required–是否必填 
//	example–举例说明 
//	hidden–隐藏
	@ApiModelProperty(name="errCode", dataType = "Integer", value="错误码", example="0")
	private Integer errCode;
	@ApiModelProperty(name="errMsg", dataType = "String", value="错误信息", example="success")
	private String errMsg;
	@ApiModelProperty(name="data", value="响应数据详情")
	private T data;
	
	
	private ResultMap() {}
	
	public static <T> ResultMap<T> success() {
		ResultMap<T> resultMap = new ResultMap<T>();
		resultMap.errCode = ResultCode.SUCCESS.getCode();
		resultMap.errMsg = ResultCode.SUCCESS.getMsg();
		return resultMap;
	}
	
	public static <T> ResultMap<T> success(T data) {
		ResultMap<T> resultMap = new ResultMap<T>();
		resultMap.errCode = ResultCode.SUCCESS.getCode();
		resultMap.errMsg = ResultCode.SUCCESS.getMsg();
		resultMap.data = data;
		return resultMap;
	}
	
	public static <T> ResultMap<T> failure(Integer errCode, String errMsg) {
		ResultMap<T> resultMap = new ResultMap<T>();
		if(errCode == null) {
			errCode = ResultCode.EXCEPTION.getCode();
			errMsg = ResultCode.EXCEPTION.getMsg();
		}
		resultMap.errCode = errCode;
		resultMap.errMsg = errMsg;
		return resultMap;
	}
	
	public static <T> ResultMap<T> failure(ResultCode resultCode) {
		ResultMap<T> resultMap = new ResultMap<T>();
		if(resultCode == null) {
			resultMap.errCode = ResultCode.EXCEPTION.getCode();
			resultMap.errMsg = ResultCode.EXCEPTION.getMsg();
		}else {
			resultMap.errCode = resultCode.getCode();
			resultMap.errMsg = resultCode.getMsg();
		}
		
		return resultMap;
	}
	
	public static <T> ResultMap<T> failure(ResultCode resultCode,T data) {
		ResultMap<T> resultMap = new ResultMap<T>();
		resultMap.data = data;
		if(resultCode == null) {
			resultMap.errCode = ResultCode.EXCEPTION.getCode();
			resultMap.errMsg = ResultCode.EXCEPTION.getMsg();
		}else {
			resultMap.errCode = resultCode.getCode();
			resultMap.errMsg = resultCode.getMsg();
		}
		return resultMap;
	}
	
	public Integer getErrCode() {
		return errCode;
	}

	public void setErrCode(Integer errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
