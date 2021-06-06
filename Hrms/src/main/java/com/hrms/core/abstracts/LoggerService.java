package com.hrms.core.abstracts;

import org.springframework.stereotype.Service;

import com.hrms.entity.concretes.Employee;

public interface LoggerService {
	void Log(Employee employee);
}
