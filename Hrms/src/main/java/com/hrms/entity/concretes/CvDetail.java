package com.hrms.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cv_details")
@AllArgsConstructor
@NoArgsConstructor
public class CvDetail {
	@Id
	@Column(name="cv_detail_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cvDetailId;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	@Column(name="description")
	private String description;
	
	@Column(name="image_adress")
	private String imageAdress;
}
