package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.CvAbilityService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvAbility;
import com.hrms.entity.dtos.CvAbilityDto;

@RestController
@RequestMapping("/api/cvabilities")
public class CvAbilityController {
	private CvAbilityService cvAbilityService;
	
	@Autowired
	public CvAbilityController(CvAbilityService cvAbilityService) {
		super();
		this.cvAbilityService = cvAbilityService;
	}
	@GetMapping("/getall")
	public DataResult <List<CvAbility>> getAll(){
		return this.cvAbilityService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody CvAbility cvAbility) {
		return this.cvAbilityService.add(cvAbility);
	}
	@GetMapping("/getByEmployeeId")
	public DataResult <List<CvAbility>> getByEmployeeId(int employeeId){
		return this.cvAbilityService.getByEmployeeId(employeeId);
	}
	
	

}
