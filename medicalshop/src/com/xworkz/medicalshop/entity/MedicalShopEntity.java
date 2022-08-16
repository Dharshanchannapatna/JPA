package com.xworkz.medicalshop.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name="Medicalshop_info")
public class MedicalShopEntity extends ParentEntity {
	@Id
	@GenericGenerator(name = "manga", strategy = "increment")
	//@GeneratedValue(generator = "manga")

	private Integer id;
	private String name;
	private String location;
	private String ownerName;

	public MedicalShopEntity(Integer id, String name, String location, String ownerName, String createdBy,
			LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.id = id;
		this.name = name;
		this.location = location;
		this.ownerName = ownerName;
	}

}
