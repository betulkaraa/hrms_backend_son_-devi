package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.CompanyService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.Company;
import com.hrms.entity.concretes.JobAdvert;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
	private CompanyService companyService;
	
	@Autowired
	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	@GetMapping("/getall")
	public DataResult <List<Company>> getAll(){
		return this.companyService.getall();
	}
	@PostMapping("add")
	public Result add(@RequestBody Company company) {
		return this.companyService.add(company);
	}

}
