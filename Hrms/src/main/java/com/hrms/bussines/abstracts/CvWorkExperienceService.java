package com.hrms.bussines.abstracts;

import java.util.List;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvLanguage;
import com.hrms.entity.concretes.CvWorkExperience;
import com.hrms.entity.dtos.CvWorkExperienceDto;

public interface CvWorkExperienceService {
	DataResult<List<CvWorkExperience>> getAll();
	
	Result add(CvWorkExperience cvWorkExperiences);
	
	DataResult<List<CvWorkExperienceDto>>  getCvWorkExperienceByCvId(int cvId);

}
