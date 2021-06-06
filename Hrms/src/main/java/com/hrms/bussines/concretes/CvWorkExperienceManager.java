package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.CvWorkExperienceService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessDataResult;
import com.hrms.core.utilities.SuccessResult;
import com.hrms.dataAccess.abstracts.CvWorkExperienceDao;
import com.hrms.entity.concretes.CvWorkExperience;
import com.hrms.entity.dtos.CvWorkExperienceDto;

@Service
public class CvWorkExperienceManager implements CvWorkExperienceService {

	private CvWorkExperienceDao cvWorkExperienceDao;
	
	@Autowired
	public CvWorkExperienceManager(CvWorkExperienceDao cvWorkExperienceDao) {
		super();
		this.cvWorkExperienceDao = cvWorkExperienceDao;
	}

	@Override
	public DataResult<List<CvWorkExperience>> getAll() {
		return new SuccessDataResult<List<CvWorkExperience>>(this.cvWorkExperienceDao.findAll(),"İşlem Başarılı");
	}

	@Override
	public Result add(CvWorkExperience cvWorkExperiences) {
		 this.cvWorkExperienceDao.save(cvWorkExperiences);
		 return new SuccessResult("İşlem Başarılı");
	}

	@Override
	public DataResult<List<CvWorkExperienceDto>>  getCvWorkExperienceByCvId(int cvId) {
		return new DataResult<List<CvWorkExperienceDto>>(this.cvWorkExperienceDao.getCvWorkExperienceByCvId(cvId),true,"İşlem Başarılı");
	}

	 

}
