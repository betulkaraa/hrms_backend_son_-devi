package com.hrms.bussines.abstracts;

import java.util.List;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.Company;
import com.hrms.entity.concretes.JobAdvert;

public interface CompanyService {
	
	DataResult<List<Company>> getall();
	Result add(Company company);

}
