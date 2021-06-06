package com.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hrms.entity.concretes.CvAbility;
import com.hrms.entity.concretes.CvLanguage;
import com.hrms.entity.dtos.CvLanguageDto;

public interface CvLanguageDao extends JpaRepository<CvLanguage,Integer>{
	List<CvLanguage> getByEmployee_employeeId(int employeeId);

}
