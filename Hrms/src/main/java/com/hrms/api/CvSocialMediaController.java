package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.CvSocialMediaService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.CvSocialMedia;

@RestController
@RequestMapping("/api/cvSocialMedia")
public class CvSocialMediaController {
	private CvSocialMediaService cvSocialMediaService;
	@Autowired
	public CvSocialMediaController(CvSocialMediaService cvSocialMediaService) {
		super();
		this.cvSocialMediaService = cvSocialMediaService;
	}
	@GetMapping("/getall")
	public DataResult <List<CvSocialMedia>> getAll(){
		return this.cvSocialMediaService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody CvSocialMedia cvSocialMedia) {
		return this.cvSocialMediaService.add(cvSocialMedia);
	}
	@GetMapping("/getByEducationId")
	public DataResult <List<CvSocialMedia>> getByEducationId(int educationId){
		return this.cvSocialMediaService.getByEmployeeId(educationId);		
	}
}
