package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.CvLanguagesService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvAbility;
import com.hrms.entity.concretes.CvLanguage;
 

@RestController
@RequestMapping("/api/cvLanguages")
public class CvLanguagesController {
	
	private CvLanguagesService cvLanguagesService;
	@Autowired
	public CvLanguagesController(CvLanguagesService cvLanguagesService) {
		super();
		this.cvLanguagesService = cvLanguagesService;
	}
	@GetMapping("/getall")
	public DataResult<List<CvLanguage>> getAll(){
		return this.cvLanguagesService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody CvLanguage foreignLanguage) {
		return this.cvLanguagesService.add(foreignLanguage);
	}
	@GetMapping("/getByEducationId")
	public DataResult <List<CvLanguage>> getByEducationId(int educationId){
		return this.cvLanguagesService.getByEmployeeId(educationId);
	}

	}
	

