package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.AdminService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.ErrorResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessResult;
import com.hrms.dataAccess.abstracts.AdminDao;
import com.hrms.entity.concretes.Admin;

@Service
public class AdminManager implements AdminService {

	private AdminDao adminDao;
	
	@Autowired
	public AdminManager(AdminDao adminDao) {
		this.adminDao=adminDao;
	}
	@Override
	public DataResult<List<Admin>> getall() {
		 return new  DataResult<List<Admin>> (this.adminDao.findAll(),true,"İşlem Başarılı");
		 
	}

	@Override
	public Result add(Admin admin) {
		 if(this.adminDao.findByadminEmail(admin.getAdminEmail())!=null) {
			 return new SuccessResult("İşlem Başarılı");
		 }
		 return new ErrorResult("İşlem Başarısız");
	}

}
