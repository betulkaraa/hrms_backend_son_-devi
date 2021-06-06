package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.CvSocialMediaService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessDataResult;
import com.hrms.dataAccess.abstracts.CvSocialMediaDao;
import com.hrms.entity.concretes.CvSocialMedia;

@Service
public class CvSocialMediaManager implements  CvSocialMediaService{
	private CvSocialMediaDao cvSocialMediDao;
	@Autowired
	public CvSocialMediaManager(CvSocialMediaDao cvSocialMediDao) {
		super();
		this.cvSocialMediDao = cvSocialMediDao;
	}
	
	@Override
	public DataResult<List<CvSocialMedia>> getAll() {
		return new SuccessDataResult<List<CvSocialMedia>>(this.cvSocialMediDao.findAll(),"İşlem Başarılı");
	}

	@Override
	public Result add(CvSocialMedia cvSocialMedia) {
		this.cvSocialMediDao.save(cvSocialMedia);
		return new SuccessDataResult("İşlem Başarılı");
	}

	@Override
	public DataResult<List<CvSocialMedia>> getByEmployeeId(int employeeId) {
		return new SuccessDataResult<List<CvSocialMedia>>(this.cvSocialMediDao.getByEmployee_employeeId(employeeId),",İşlem Başarılı");
	}

}
