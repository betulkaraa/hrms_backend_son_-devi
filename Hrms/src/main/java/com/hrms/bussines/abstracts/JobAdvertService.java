package com.hrms.bussines.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.JobAdvert;

public interface JobAdvertService {

	DataResult<List<JobAdvert>> getall();
	Result add(JobAdvert jobAdvert);
	DataResult<List<JobAdvert>> getJobAdvertActive();
	DataResult<List<JobAdvert>> getJobAdvertActiveOrderBy();
	DataResult<List<JobAdvert>> getCompanyActiveAdvert(int id);
 
}

