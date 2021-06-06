package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.AdminService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.Admin;
import com.hrms.entity.concretes.Company;

@RestController
@RequestMapping("/api/admins")
public class AdminController {
private AdminService adminService;
	
	@Autowired
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	@GetMapping("/getall")
	public DataResult <List<Admin>> getAll(){
		return this.adminService.getall();
	}
	@PostMapping("add")
	public Result add(@RequestBody Admin admin) {
		return this.adminService.add(admin);
	}
}
