package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.EmployeeService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.Employee;
import com.hrms.entity.dtos.CvDto;

@RestController
@RequestMapping("/api/employee")
public class EmployeeControl {
	private EmployeeService employeeService;

	@Autowired
	public EmployeeControl(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@GetMapping("/getall")
	public DataResult <List<Employee>> getAll(){
		return this.employeeService.getall();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employee employee) {
		return this.employeeService.add(employee);
	}
	@GetMapping("/getByEmployeeId")
	public DataResult<CvDto> getByEmployeeId(int employeeId) {
		return this.employeeService.getByEmployeeId(employeeId);
	}

}
