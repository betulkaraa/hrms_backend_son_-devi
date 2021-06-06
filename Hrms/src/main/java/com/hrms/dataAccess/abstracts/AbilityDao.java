package com.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.entity.concretes.Ability;

public interface AbilityDao extends JpaRepository<Ability,Integer>{

}
