package com.xworkz.medicalshop.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@MappedSuperclass

public class ParentEntity {
	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;

	public ParentEntity(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

}
