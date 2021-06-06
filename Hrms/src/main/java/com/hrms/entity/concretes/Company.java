package com.hrms.entity.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="companies")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvert"})

public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="company_id")
	private int companyId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_phone")
	private String companyPhone;
	
	@Column(name="company_website")
	private String companyWebsite;
	
	@Column(name="company_email")
	private String companyEmail;
	
	@Column(name="company_password")
	private String companyPassword;
	
	@OneToMany(mappedBy = "company")
	private List<JobAdvert> jobAdvert;
}
