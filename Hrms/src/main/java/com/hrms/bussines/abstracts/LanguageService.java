package com.hrms.bussines.abstracts;

import java.util.List;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.Language;

public interface LanguageService {
	DataResult<List<Language>> getall();
	Result add(Language Language);

}
