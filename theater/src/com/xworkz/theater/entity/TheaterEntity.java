package com.xworkz.theater.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="theater_info")
public class TheaterEntity {
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="theatername")
	private String theaterName;
	@Column(name="location")
	private String location;
	@Column(name="noofshowsperday")
	private Integer noOfShowsPerDay;
	@Column(name="costperperson")
	private Double costPerPerson;
	@Column(name="createdby")
	private String createdBy;
	@Column(name="createddate")
	private LocalDate createdDate;
	@Column(name="updatedby")
	private String updatedBy;
	@Column(name="updateddate")
	private LocalDate updatedDate;


}
