package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.JobAdvertService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.JobAdvert;
@RestController
@RequestMapping("/api/jobAdvert")
public class JobAdvertController {
	
		private JobAdvertService jobAdvertService;
		
		@Autowired
		public JobAdvertController(JobAdvertService jobAdvertService) {
			super();
			this.jobAdvertService = jobAdvertService;
		}
		@GetMapping("/getall")
		public DataResult <List<JobAdvert>> getAll(){
			return this.jobAdvertService.getall();
		}
		@PostMapping("add")
		public Result add(@RequestBody  JobAdvert jobAdvert) {
			return this.jobAdvertService.add(jobAdvert);
		}
 
		
		@GetMapping("/getJobAdvertActive")
		public DataResult<List<JobAdvert>> getJobAdvertActive(){
			return this.jobAdvertService.getJobAdvertActive();
		}
		
		@GetMapping("/getJobAdvertActiveOrderBy")
		public DataResult<List<JobAdvert>> getJobAdvertActiveOrderBy(){
			return this.jobAdvertService.getJobAdvertActiveOrderBy();
		}
		
		@GetMapping("/getCompanyActiveAdvert")
		public DataResult<List<JobAdvert>> getCompanyActiveAdvert( @RequestParam("companyId") int id){
			return this.jobAdvertService.getCompanyActiveAdvert(id);
		}

		
}
