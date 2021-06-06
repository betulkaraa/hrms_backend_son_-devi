package com.hrms.entity.dtos;

import java.time.LocalDate;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CvEducationDto {
	private int educationId;
	
	private String schoolName;
	
	private String degree;
	
	private LocalDate startDate;
	
	private LocalDate finishDate;
	
	private String description;
	
	private int employeeId;
}
