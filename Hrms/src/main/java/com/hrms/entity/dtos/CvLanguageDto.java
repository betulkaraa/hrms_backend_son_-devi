package com.hrms.entity.dtos;

import com.hrms.entity.concretes.Language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CvLanguageDto {
		private int cvLanguageId;
		
		private int employeeId;
	 
		private int languageName;
		
		private String languageLevel;
		
}
