package com.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hrms.entity.concretes.Employee;
import com.hrms.entity.dtos.CvDto;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{
	  
	 
}
