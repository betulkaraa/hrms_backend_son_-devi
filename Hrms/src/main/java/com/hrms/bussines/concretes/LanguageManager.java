package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.LanguageService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessDataResult;
import com.hrms.core.utilities.SuccessResult;
import com.hrms.dataAccess.abstracts.LanguageDao;
import com.hrms.entity.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
private LanguageDao languageDao;

	@Autowired
	public LanguageManager(LanguageDao languageDao) {
	super();
	this.languageDao = languageDao;
}

	@Override
	public DataResult<List<Language>> getall() {
 		return new SuccessDataResult<List<Language>>(this.languageDao.findAll(),"İşlem Başarılı");
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("İşlem Başarılı");
	}


}
