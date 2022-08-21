package com.xworkz.supermarket.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@Table(name = "supermarket_info")
@ToString(callSuper = true)

public class SuperMarketEntity extends ParentEntity {
	@Id
	@Min(value = 1, message = "Id not available")
	private Integer id;
	@NotNull

	private String marketName;
	@NotNull
	private String location;
	@Min(value = 10)
	@Max(value = 1000)

	private Integer noOfStalls;
	@Min(value = 1000)
	@Max(value = 2000)

	private Integer maxCapacity;

	public SuperMarketEntity(Integer id, String marketName, String location, Integer noOfStalls, Integer maxCapacity,
			String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.id = id;
		this.marketName = marketName;
		this.location = location;
		this.noOfStalls = noOfStalls;
		this.maxCapacity = maxCapacity;
	}

}
