package com.hrms.entity.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
public class CvWorkExperienceDto {

	private int workExperienceId;

	private String companyName;
	
	private String jobPosition;
	
	private String startYear;
	
	private String finishYear;
	
	private String description;
	
	private int employeeId;

	

}
