package com.hrms.bussines.abstracts;

import java.util.List;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvDetail;

public interface CvDetailService {
	DataResult<List<CvDetail>> getAll();
	
	Result add(CvDetail cvDetail);
	
	DataResult<List<CvDetail>> getByEmployeeId(int employeeId);
}
