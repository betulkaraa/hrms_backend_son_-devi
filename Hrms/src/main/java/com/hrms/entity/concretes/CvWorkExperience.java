package com.hrms.entity.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cv_work_experience")
@AllArgsConstructor
@NoArgsConstructor

public class CvWorkExperience {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="work_experience_id")
	private int workExperienceId;
	
	@ManyToOne()
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="job_position")
	private String jobPosition;
	
	
	@Column(name="start_year")
	private String startYear;
	
	@Column(name="finish_year")
	private String finishYear;
	
	@Column(name="description")
	private String description;
	
	
	

}
