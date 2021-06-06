package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.AbilityService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessDataResult;
import com.hrms.core.utilities.SuccessResult;
import com.hrms.dataAccess.abstracts.AbilityDao;
import com.hrms.entity.concretes.Ability;
@Service
public class AbilityManager implements AbilityService{
	
	private AbilityDao abilityDao;
	
	@Autowired
	public AbilityManager(AbilityDao abilityDao) {
		super();
		this.abilityDao = abilityDao;
	}

	@Override
	public DataResult<List<Ability>> getall() {
 		return new SuccessDataResult<List<Ability>>(this.abilityDao.findAll(),"İşlem Başarılı");
	}

	@Override
	public Result add(Ability abilitiy) {
		this.abilityDao.save(abilitiy);
		return new SuccessResult("İşlem Başarılı");
	}

}
