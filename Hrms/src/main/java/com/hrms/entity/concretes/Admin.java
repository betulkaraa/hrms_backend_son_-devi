package com.hrms.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="admins")
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="admin_id")
	private int adminId;
	
	@Column(name="admin_name")
	private String adminName;
	
	@Column(name="admin_surname")
	private String adminSurname;
	
	@Column(name="admin_phone_number")
	private String adminPhoneNumber;
	
	@Column(name="admin_email")
	private String adminEmail;
	
	@Column(name="admin_password")
	private String adminPassword;
	
	@Column(name="admin_job_postion")
	private String adminJobPosition;
	
}
