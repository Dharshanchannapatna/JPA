package com.xworkz.pub.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
@Data
@Entity
@Table(name="pub_info")


public class PubEntity {
	@Id
	@Column(name="pid")
	private Integer pid;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="checkintime")
	private LocalTime  checkInTime;
	@Column(name="checkouttime")
	private LocalTime checkOutTime;
	@Column(name="createdby")
	private String createdBy;
	@Column(name="createddate")
	private  LocalDate createdDate;
	@Column(name="updatedby")
	private String updatedBy;
	@Column(name="updateddate")
	private LocalDate updatedDate;

}
