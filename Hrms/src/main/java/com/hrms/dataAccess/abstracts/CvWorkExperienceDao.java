package com.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hrms.entity.concretes.CvWorkExperience;
import com.hrms.entity.dtos.CvWorkExperienceDto;

public interface CvWorkExperienceDao extends JpaRepository<CvWorkExperience,Integer> {
	
	@Query("Select new com.hrms.entity.dtos.CvWorkExperienceDto(cw.workExperienceId,cw.companyName,cw.jobPosition,"
			+ "cw.startYear,cw.finishYear,cw.description,x.employeeId)"
			+ "From CvWorkExperience cw Inner Join cw.employee x Where x.employeeId=:employeeId order by cw.finishYear desc")
	List<CvWorkExperienceDto> getCvWorkExperienceByCvId(int employeeId);

}


