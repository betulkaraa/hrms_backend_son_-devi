package com.hrms.core.concretes;

import org.springframework.stereotype.Service;

import com.hrms.Logger.concretes.EmailLogger;
import com.hrms.core.abstracts.LoggerService;
import com.hrms.entity.concretes.Employee;
@Service
public class LoggerManager implements LoggerService {
	
	@Override
	public void Log(Employee employee) {
		
		EmailLogger emailLogger=new EmailLogger();
		emailLogger.Log(employee);
	}

}
