package com.hrms.entity.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employees")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="employee_surname")
	private String employeeSurname;
	
	@Column(name="employee_identity_number")
	private String employeeIdentityNumber;
	
	@Column(name="employee_password")
	private String employeePassword;
	
	@Column(name="employee_birth_year")
	private int  employeeBirthyear;

	@Column(name="employee_email")
	private String email;
	
	@Column(name="employee_is_verified")
	private boolean  verified;
	@JsonIgnore
	@OneToMany(mappedBy="employee")
	private List<CvAbility> cvAbility;
	@JsonIgnore
	@OneToMany(mappedBy="employee")
	private List<CvEducation> cvEducation;

	@JsonIgnore
	@OneToMany(mappedBy="employee")
	private List<CvWorkExperience> cvWorkExperience;

	@JsonIgnore
	@OneToMany(mappedBy="employee")
	private List<CvLanguage> cvLanguage;

	




}
