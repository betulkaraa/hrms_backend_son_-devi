package com.hrms.dataAccess.abstracts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.entity.concretes.City;

public interface CityDao extends JpaRepository<City,Integer>{

	 
	
}
