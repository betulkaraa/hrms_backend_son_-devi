package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.CvEducationService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessDataResult;
import com.hrms.core.utilities.SuccessResult;
import com.hrms.dataAccess.abstracts.CvEducationDao;
import com.hrms.entity.concretes.CvEducation;
import com.hrms.entity.dtos.CvEducationDto;
@Service
public class CvEducationManager implements CvEducationService{
private CvEducationDao cvEducationDao;
	
	@Autowired
	public CvEducationManager(CvEducationDao cvEducationDao) {
		super();
		this.cvEducationDao = cvEducationDao;
	}

	@Override
	public DataResult<List<CvEducation>> getAll() {
		return new SuccessDataResult<List<CvEducation>>(this.cvEducationDao.findAll(),"İşlem Başarılı");
	}

	@Override
	public Result add(CvEducation cvEducation) {
		 this.cvEducationDao.save(cvEducation);
		 return new SuccessResult("İşlem Başarılı");
	}

	@Override
	public DataResult<List<CvEducationDto>> getCvEducationB(int cvId) {
		 return new SuccessDataResult<List<CvEducationDto>>(this.cvEducationDao.getCvEducationB(cvId),"İşlem Başarılı");
	}
}
