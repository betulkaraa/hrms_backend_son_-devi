package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.AbilityService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.Ability;
import com.hrms.entity.concretes.Admin;

@RestController
@RequestMapping("/api/abilities")
public class AbilityController {
	private AbilityService abilityService;
	@Autowired
	public AbilityController(AbilityService abilityService) {
		super();
		this.abilityService = abilityService;
	}
	@GetMapping("/getall")
	public DataResult <List<Ability>> getAll(){
		return this.abilityService.getall();
	}
	@PostMapping("add")
	public Result add(@RequestBody Ability ability) {
		return this.abilityService.add(ability);
	}
}
