package com.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.entity.concretes.Language;

public interface LanguageDao  extends JpaRepository<Language,Integer>{

}
