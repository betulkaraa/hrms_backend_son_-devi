package com.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.entity.concretes.CvAbility;

public interface CvAbilityDao extends JpaRepository<CvAbility,Integer>  {
	
	List<CvAbility> getByEmployee_employeeId(int employeeId);
}
