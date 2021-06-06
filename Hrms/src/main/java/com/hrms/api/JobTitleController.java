package com.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.JobTitleService;
@RestController
@RequestMapping("/api/jobTitleController ")
public class JobTitleController {
	
	private JobTitleService jobTitleService;
	
	@Autowired
	public JobTitleController( JobTitleService jobTitleService) {
			super();
			this.jobTitleService = jobTitleService;
		
	
	}
}
