package com.xworkz.supermarket.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@MappedSuperclass

public class ParentEntity {
	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate updatedDate;

}
