package com.xworkz.cycleshop.entity;

import lombok.*;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Data

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cycleshop_info")
@NamedQueries({
	@NamedQuery(name = "findByName", query = "select cs from CycleShopEntity  cs where cs.name=:na"),
	@NamedQuery(name="findByLocationAndOwnerName",query="select cs from CycleShopEntity cs where cs.location=:loc and cs.ownerName=:own")
})

public class CycleShopEntity {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "location")
	private String location;
	@Column(name = "ownername")
	private String ownerName;
	@Column(name = "createddate")
	private LocalDate createdDate;
	@Column(name = "updatedby")
	private String updatedBy;
	@Column(name = "updateddate")
	private LocalDate updatedDate;

}
