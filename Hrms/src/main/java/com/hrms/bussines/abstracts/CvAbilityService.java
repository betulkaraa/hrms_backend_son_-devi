package com.hrms.bussines.abstracts;

import java.util.List;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvAbility;
import com.hrms.entity.concretes.CvDetail;
import com.hrms.entity.dtos.CvAbilityDto;

public interface CvAbilityService {

	DataResult<List<CvAbility>> getAll();
	
	Result add(CvAbility cvAbilities);
	
	DataResult<List<CvAbility>> getByEmployeeId(int employeeId);

}
