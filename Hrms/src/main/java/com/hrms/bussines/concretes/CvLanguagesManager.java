package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.CvLanguagesService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessDataResult;
import com.hrms.dataAccess.abstracts.CvLanguageDao;
import com.hrms.entity.concretes.CvLanguage;

@Service
public class CvLanguagesManager implements CvLanguagesService {
	
	private CvLanguageDao cvLanguagesDao;
	
	@Autowired
	public CvLanguagesManager(CvLanguageDao cvLanguagesDao) {
		super();
		this.cvLanguagesDao = cvLanguagesDao;
	}

	@Override
	public DataResult<List<CvLanguage>> getAll() {
		return new SuccessDataResult<List<CvLanguage>>(this.cvLanguagesDao.findAll(),"sas");
	}

	@Override
	public Result add(CvLanguage cvLanguages) {
		 this.cvLanguagesDao.save(cvLanguages);
		 return new Result(true,"İşlem Başarılı");
		 
	}

	@Override
	public DataResult<List<CvLanguage>> getByEmployeeId(int employeeId) {
		 return new SuccessDataResult<List<CvLanguage>>(this.cvLanguagesDao.getByEmployee_employeeId(employeeId),"İşlem Tamam");
	}

	 
	

	 
}
