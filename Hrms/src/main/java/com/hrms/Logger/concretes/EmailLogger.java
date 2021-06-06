package com.hrms.Logger.concretes;

import com.hrms.Logger.abstracts.Logger;
import com.hrms.entity.concretes.Employee;

public class EmailLogger implements Logger{

	@Override
	public void Log(Employee employee) {
		System.out.println(employee.getEmployeeName()+" "+employee.getEmployeeSurname()+"'adlı kullanıcıya E-Mail Doğrulama Linki gönderildi");

		
	}
 

 

}
