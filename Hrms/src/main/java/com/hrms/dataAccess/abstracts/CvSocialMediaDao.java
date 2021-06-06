package com.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.entity.concretes.CvLanguage;
import com.hrms.entity.concretes.CvSocialMedia;

public interface CvSocialMediaDao extends JpaRepository<CvSocialMedia,Integer> {
	List<CvSocialMedia> getByEmployee_employeeId(int employeeId);

}
