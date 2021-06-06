package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.CvAbilityService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessDataResult;
import com.hrms.core.utilities.SuccessResult;
import com.hrms.dataAccess.abstracts.CvAbilityDao;
import com.hrms.entity.concretes.CvAbility;
import com.hrms.entity.dtos.CvAbilityDto;

@Service
public class CvAbilityManager implements CvAbilityService{

	private CvAbilityDao cvAbilityDao;
	
	@Autowired
	public CvAbilityManager(CvAbilityDao cvAbilityDao) {
		super();
		this.cvAbilityDao = cvAbilityDao;
	}

	@Override
	public DataResult<List<CvAbility>> getAll() {
 		return new SuccessDataResult<List<CvAbility>>(this.cvAbilityDao.findAll(),"İşlem Başarılı");
	}

	@Override
	public Result add(CvAbility cvAbilitiy) {
		this.cvAbilityDao.save(cvAbilitiy);
		return new SuccessResult("İşlem Başarılı");
	}


	@Override
	public DataResult<List<CvAbility>> getByEmployeeId(int employeeId) {
		return new SuccessDataResult<List<CvAbility>>(this.cvAbilityDao.getByEmployee_employeeId(employeeId),"İşlem Başarılı");
	}
 

}
