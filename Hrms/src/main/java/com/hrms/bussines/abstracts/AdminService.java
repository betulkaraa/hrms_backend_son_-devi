package com.hrms.bussines.abstracts;

import java.util.List;

import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.Admin;

public interface AdminService {
	

	DataResult<List<Admin>> getall();
	Result add(Admin admin);
}
