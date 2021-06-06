package com.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hrms.entity.concretes.CvEducation;
import com.hrms.entity.dtos.CvEducationDto;

public interface CvEducationDao extends JpaRepository<CvEducation,Integer> {

	    List<CvEducation> getByEducationId(int employeeId);

		@Query("Select new com.hrms.entity.dtos.CvEducationDto(ce.educationId,ce.schoolName,ce.degree,ce.startDate,ce.finishDate,ce.description,x.employeeId)"
				+ "From CvEducation ce Inner Join ce.employee x Where x.employeeId=:employeeId order by ce.finishDate desc")
		List<CvEducationDto> getCvEducationB(int employeeId);
}
