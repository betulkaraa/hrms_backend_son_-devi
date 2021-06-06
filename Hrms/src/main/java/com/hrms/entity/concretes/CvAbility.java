package com.hrms.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cv_abilities")
@AllArgsConstructor
@NoArgsConstructor

	
public class CvAbility {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cv_ability_id")
	private int cvAbilityId;
	
	@ManyToOne()
	@JoinColumn(name="employee_id")
	private Employee employee;
	
    @ManyToOne()
    @JoinColumn(name="ability_id")
	private Ability ability ;
    
}
