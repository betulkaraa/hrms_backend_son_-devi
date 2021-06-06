package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.CvWorkExperienceService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvWorkExperience;
import com.hrms.entity.dtos.CvWorkExperienceDto;

@RestController
@RequestMapping("/api/cvWorkExperience")
public class CvWorkExperienceController {
	private CvWorkExperienceService cvWorkExperienceService;
	@Autowired
	public CvWorkExperienceController(CvWorkExperienceService cvWorkExperienceService) {
		super();
		this.cvWorkExperienceService = cvWorkExperienceService;
	}
	@GetMapping("/getall")
	public DataResult <List<CvWorkExperience>> getAll(){
		return this.cvWorkExperienceService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody CvWorkExperience cvWorkExperience) {
		return this.cvWorkExperienceService.add(cvWorkExperience);
	}
	@GetMapping("/getCvWorkExperienceByCvId")
	public DataResult <List<CvWorkExperienceDto>> getCvWorkExperienceByCvId(int cvId){
		return this.cvWorkExperienceService.getCvWorkExperienceByCvId(cvId);
	}
	
	
}
