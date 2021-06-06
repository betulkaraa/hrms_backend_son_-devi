package com.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.entity.concretes.Admin;

public interface AdminDao extends JpaRepository<Admin,Integer>{
	 Admin findByadminEmail(String email);
}
