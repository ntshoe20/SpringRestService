package com.itu.spring.rest;

/*
 * Second class to be created, the base class for our response
 * 2018-07-21
 * Itumeleng Ntshoe
 */

public class BaseResponse {
	
	private String status;
	private Integer code;
	 
	 public BaseResponse(){
		 
	 }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
