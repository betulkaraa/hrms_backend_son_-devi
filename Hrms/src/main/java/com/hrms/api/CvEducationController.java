package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.CvEducationService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvEducation;
import com.hrms.entity.dtos.CvEducationDto;

@RestController
@RequestMapping("/api/cvEducation")
public class CvEducationController {
	private  CvEducationService cvEducationService;
	@Autowired
	public CvEducationController(CvEducationService cvEducationService) {
		super();
		this.cvEducationService = cvEducationService;
	}
	@GetMapping("/getall")
	public DataResult <List<CvEducation>> getAll(){
		return this.cvEducationService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody CvEducation cvEducation) {
		return this.cvEducationService.add(cvEducation);
	}
	@GetMapping("/getByCvId")
	public DataResult<List<CvEducationDto>> getCvEducationB(int cvId) {
		 return this.cvEducationService.getCvEducationB(cvId);
	}
	
}
