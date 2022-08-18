package com.xworkz.cartooncharacter.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@MappedSuperclass

public class ParentEntity {
	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate updatedDate;

	public ParentEntity(String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

}
