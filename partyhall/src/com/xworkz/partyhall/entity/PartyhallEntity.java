package com.xworkz.partyhall.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
@Entity
@Data
@Table(name="partyhall_info")
@AllArgsConstructor
@NoArgsConstructor

public class PartyhallEntity {
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="opeaningtime")
	private LocalTime opeaningTime;
	@Column(name="closingtime")
	private LocalTime closingTime;
	@Column(name="createdby")
	private String createdBy;
	@Column(name="createddate")
	private LocalDate createdDate;
	@Column(name="updatedby")
	private String updatedBy;
	@Column(name="updateddate")
	private LocalDate updatedDate;

}
