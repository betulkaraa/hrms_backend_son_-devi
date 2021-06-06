package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.JobAdvertService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessDataResult;
import com.hrms.core.utilities.SuccessResult;
import com.hrms.dataAccess.abstracts.JobAdvertDao;
import com.hrms.entity.concretes.JobAdvert;

@Service
public class JobAdvertManager  implements JobAdvertService{
		private JobAdvertDao jobAdvertDao;
	
	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}
	@Override
	public DataResult<List<JobAdvert>> getall() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(),"İşlem Başarılı");
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("işlem Başarılı");
	}
	@Override
	public DataResult<List<JobAdvert>> getJobAdvertActive() {
		 return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getJobAdvertActive(),",işlem başarılı");
	}
	@Override
	public DataResult<List<JobAdvert>> getJobAdvertActiveOrderBy() {
		 return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getJobAdvertActiveOrderBy(),",işlem başarılı");

	}
	@Override
	public DataResult<List<JobAdvert>> getCompanyActiveAdvert(int id) {
		 return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getCompanyActiveAdvert(id),"işlem başarılı");

	}
	
	}

 
