package com.hrms.entity.concretes;

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
@Table(name="cv_social_medias")
@AllArgsConstructor
@NoArgsConstructor
public class CvSocialMedia {
	@Id
	@Column(name="social_media_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int socialMediaId;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	@Column(name="linkedin_adress")
	private String linkedinAdress;
		
	@Column(name="github_adress")
	private String githubAdress;
}

 
