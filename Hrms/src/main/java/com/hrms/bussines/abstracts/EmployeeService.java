package com.hrms.bussines.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.Employee;
import com.hrms.entity.dtos.CvDto;

public interface EmployeeService {

	DataResult<List<Employee>> getall();
	Result add(Employee employee);
	DataResult<CvDto> getByEmployeeId(int employeeId) ;
 }
