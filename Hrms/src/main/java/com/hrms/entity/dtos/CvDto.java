package com.hrms.entity.dtos;

import java.util.List;

import com.hrms.entity.concretes.CvAbility;
import com.hrms.entity.concretes.CvDetail;
import com.hrms.entity.concretes.CvEducation;
import com.hrms.entity.concretes.CvLanguage;
import com.hrms.entity.concretes.CvSocialMedia;
import com.hrms.entity.concretes.CvWorkExperience;
import com.hrms.entity.concretes.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CvDto {
	private Employee employee;
	
	private List<CvDetail> cvDetail;
	
	private List<CvSocialMedia> cvSocialMedia;
	
	private List<CvAbility> cvAbility;
	
	private List<CvEducationDto> cvEducation;

	private List<CvLanguage> cvLanguages;

	private List<CvWorkExperienceDto> cvWorkExperience;

	
	
	
	 

}
