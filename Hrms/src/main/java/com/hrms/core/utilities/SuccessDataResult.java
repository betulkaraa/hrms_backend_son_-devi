package com.hrms.core.utilities;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data , String message) {
		super(data,true, message);
	}
	public SuccessDataResult(String message) {
		super(null,true,message);
	}

	

}
