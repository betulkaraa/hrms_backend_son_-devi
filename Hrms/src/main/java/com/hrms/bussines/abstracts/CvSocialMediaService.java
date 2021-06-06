package com.hrms.bussines.abstracts;

import java.util.List;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvSocialMedia;

public interface CvSocialMediaService {
	DataResult<List<CvSocialMedia>> getAll();
	
	Result add(CvSocialMedia cvSocialMedia);
	
	DataResult<List<CvSocialMedia>> getByEmployeeId(int employeeId);
}
