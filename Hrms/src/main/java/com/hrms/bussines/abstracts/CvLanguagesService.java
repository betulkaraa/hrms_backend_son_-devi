package com.hrms.bussines.abstracts;

import java.util.List;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvDetail;
import com.hrms.entity.concretes.CvLanguage;
 
public interface CvLanguagesService {

	DataResult<List<CvLanguage>> getAll();
	
	Result add(CvLanguage cvLanguages);
	
	DataResult<List<CvLanguage>> getByEmployeeId(int employeeId);


}