package com.hrms.core.concretes;

import org.springframework.stereotype.Service;

import com.hrms.core.abstracts.MernisService;
import com.hrms.entity.concretes.Employee;
import com.hrms.mernis.MernisControl;
@Service
public class MernisManager implements  MernisService {

	@Override
	public void Control(Employee employee) {
		MernisControl mernisControl=new MernisControl();
		mernisControl.control(employee);
	}
	
}
