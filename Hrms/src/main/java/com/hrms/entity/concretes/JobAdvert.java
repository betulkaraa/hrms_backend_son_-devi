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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_adverts")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvert {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="job_advert_id")
	private int jobAdvertId;
	
	@ManyToOne()
	@JoinColumn(name="company_id")
	private Company company;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;

	@ManyToOne()
	@JoinColumn(name="job_title_id")
	private JobTitle jobTitleId;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="job_advert_deadline")
	private LocalDate jobAdvertDeadline;
	
	@Column(name="is_job_advert_active")
	private boolean isJobAdvertActive;

	@Column(name="count_of_job_position")
	private int countOfJobPosition;
	
	@Column(name="created_date")
	private LocalDate createdDate;
	
	 

}
