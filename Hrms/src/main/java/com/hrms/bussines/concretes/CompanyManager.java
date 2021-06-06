package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.CompanyService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessDataResult;
import com.hrms.core.utilities.SuccessResult;
import com.hrms.dataAccess.abstracts.CompanyDao;
import com.hrms.entity.concretes.Company;
import com.hrms.entity.concretes.JobAdvert;

@Service
public class CompanyManager implements CompanyService {
	
	private CompanyDao companyDao;
	
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	public DataResult<List<Company>> getall() {
	 	return new SuccessDataResult<List<Company>>(this.companyDao.findAll(),"işlem Başarılı");

	}

	@Override
	public Result add(Company company) {
		 this.companyDao.save(company);
		 return new SuccessResult("İşlem Başarılı");
	}

	
	

}
