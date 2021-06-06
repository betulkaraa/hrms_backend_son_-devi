package com.hrms.bussines.abstracts;

import java.util.List;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvEducation;
import com.hrms.entity.dtos.CvEducationDto;

public interface CvEducationService {
	DataResult<List<CvEducation>> getAll();
	
	Result add(CvEducation  cvEducation);
	
	DataResult<List<CvEducationDto>> getCvEducationB(int cvId);
}
