package com.hrms.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.bussines.abstracts.CvAbilityService;
import com.hrms.bussines.abstracts.CvDetailService;
import com.hrms.bussines.abstracts.CvEducationService;
import com.hrms.bussines.abstracts.CvLanguagesService;
import com.hrms.bussines.abstracts.CvSocialMediaService;
import com.hrms.bussines.abstracts.CvWorkExperienceService;
import com.hrms.bussines.abstracts.EmployeeService;
import com.hrms.core.abstracts.LoggerService;
import com.hrms.core.abstracts.MernisService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.core.utilities.SuccessDataResult;
import com.hrms.core.utilities.SuccessResult;
import com.hrms.dataAccess.abstracts.EmployeeDao;
import com.hrms.entity.concretes.Employee;
import com.hrms.entity.dtos.CvDto;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	private LoggerService loggerService;
	private MernisService mernisService;
	private CvAbilityService cvAbilityService;
	private CvDetailService cvDetailService;
	private CvEducationService cvEducationService;
	private CvLanguagesService cvLanguagesService;
	private CvSocialMediaService cvSocialMediaService;
	private CvWorkExperienceService cvWorkExperienceService;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao, LoggerService loggerService, MernisService mernisService,
			CvAbilityService cvAbilityService, CvDetailService cvDetailService, CvEducationService cvEducationService,
			CvLanguagesService cvLanguagesService, CvSocialMediaService cvSocialMediaService,
			CvWorkExperienceService cvWorkExperienceService) {
		super();
		this.employeeDao = employeeDao;
		this.loggerService = loggerService;
		this.mernisService = mernisService;
		this.cvAbilityService = cvAbilityService;
		this.cvDetailService = cvDetailService;
		this.cvEducationService = cvEducationService;
		this.cvLanguagesService = cvLanguagesService;
		this.cvSocialMediaService = cvSocialMediaService;
		this.cvWorkExperienceService = cvWorkExperienceService;
	}


	@Override
	public DataResult<List<Employee>> getall() {
		return new DataResult<List<Employee>>(this.employeeDao.findAll(),true,"İşlem Başarılı");
	}
	

	@Override
	public Result add(Employee employee) {
		 this.loggerService.Log(employee);
		 this.mernisService.Control(employee);
		 this.employeeDao.save(employee);
		 return new SuccessResult("işlem Başarılı");
	}

	public DataResult<CvDto> getByEmployeeId(int employeeId) {
			CvDto dto = new CvDto();
			dto.setEmployee(this.employeeDao.findById(employeeId).get());
			dto.setCvAbility(this.cvAbilityService.getByEmployeeId(employeeId).getData());
			dto.setCvSocialMedia(this.cvSocialMediaService.getByEmployeeId(employeeId).getData());
			dto.setCvDetail(this.cvDetailService.getByEmployeeId(employeeId).getData());
			dto.setCvEducation(this.cvEducationService.getCvEducationB(employeeId).getData());
			dto.setCvWorkExperience(this.cvWorkExperienceService.getCvWorkExperienceByCvId(employeeId).getData());
			dto.setCvLanguages(this.cvLanguagesService.getByEmployeeId(employeeId).getData());
			return new SuccessDataResult<CvDto> (dto,"İşlem Başarılı");
	}
		

	 
}

