package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.CvDetailService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvDetail;
import com.hrms.entity.concretes.CvSocialMedia;

@RestController
@RequestMapping("/api/cvDetail")
public class CvDetailController  {
	private CvDetailService cvDetailService;
	@Autowired
	public CvDetailController(CvDetailService cvDetailService) {
		super();
		this.cvDetailService = cvDetailService;
	}
	@GetMapping("/getall")
	public DataResult <List<CvDetail>> getAll(){
		return this.cvDetailService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody CvDetail cvDetail) {
		return this.cvDetailService.add(cvDetail);
	}
	@GetMapping("/getByEmployeeId")
	public DataResult <List<CvDetail>> getByEmployeeId(int employeeId){
		return this.cvDetailService.getByEmployeeId(employeeId);
		
	}
}
