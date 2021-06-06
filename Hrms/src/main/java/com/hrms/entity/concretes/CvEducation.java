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
@Table(name="cv_educations")
@AllArgsConstructor
@NoArgsConstructor

public class CvEducation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="education_id")
	private int educationId;
	
	@ManyToOne()
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="degree")
	private String degree;
	
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="finish_date")
	private LocalDate finishDate;
	
	@Column(name="description")
	private String description;
	

}
