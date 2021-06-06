package com.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.bussines.abstracts.LanguageService;
import com.hrms.core.utilities.DataResult;
import com.hrms.core.utilities.Result;
import com.hrms.entity.concretes.Ability;
import com.hrms.entity.concretes.Language;
@RestController
@RequestMapping("/api/language")
public class LanguageController {
	private LanguageService languageService;
	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public DataResult <List<Language>> getAll(){
		return this.languageService.getall();
	}
	@PostMapping("add")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
	}
}
