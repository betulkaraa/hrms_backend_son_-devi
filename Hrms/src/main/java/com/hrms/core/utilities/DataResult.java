package com.hrms.core.utilities;

public class DataResult <T> extends Result{

	public T data;
	public DataResult(T data , boolean success, String message) {
		super(success, message);
		this.data=data;
	}

	public T getData() {
		return this.data;
	}


}
