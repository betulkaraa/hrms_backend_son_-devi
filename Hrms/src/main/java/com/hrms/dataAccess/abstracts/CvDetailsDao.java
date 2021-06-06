package com.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.entity.concretes.CvDetail;

public interface CvDetailsDao extends JpaRepository<CvDetail,Integer> {
	List<CvDetail> getByEmployee_employeeId(int employeeId);

}
