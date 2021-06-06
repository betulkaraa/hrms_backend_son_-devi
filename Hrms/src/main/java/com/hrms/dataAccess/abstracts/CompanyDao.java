package com.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.entity.concretes.Company;
import com.hrms.entity.concretes.JobAdvert;

public interface CompanyDao extends JpaRepository<Company,Integer>{
	
}
