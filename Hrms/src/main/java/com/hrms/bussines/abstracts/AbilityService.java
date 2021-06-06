package com.hrms.bussines.abstracts;

import java.util.List;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.Ability;

public interface AbilityService {
	DataResult<List<Ability>> getall();
	Result add(Ability abilities);

}
