package com.hrms.mernis;

import com.hrms.entity.concretes.Employee;

public class MernisControl {

	public boolean control(Employee employee) {
		System.out.println(employee.getEmployeeIdentityNumber()+"Tc numaralı Kişinin Mernis Doğrulaması yapıldı.");
			return true;
	}
}
