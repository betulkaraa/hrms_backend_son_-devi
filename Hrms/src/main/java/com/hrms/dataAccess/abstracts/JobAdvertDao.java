package com.hrms.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hrms.entity.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert,Integer> {
	
	@Query("From JobAdvert where isJobAdvertActive = true")
	List<JobAdvert> getJobAdvertActive();
	
	@Query("From JobAdvert where isJobAdvertActive = true Order By createdDate Desc ")
	List<JobAdvert> getJobAdvertActiveOrderBy();
	
	@Query("From JobAdvert where isJobAdvertActive = true and company.companyId =:id")
	List<JobAdvert> getCompanyActiveAdvert(int id);
	

}
