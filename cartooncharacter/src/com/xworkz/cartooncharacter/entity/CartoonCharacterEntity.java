package com.xworkz.cartooncharacter.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@Table(name = "cartooncharacter_info")
@NamedQueries({ @NamedQuery(name = "findByName", query = "select cc from CartoonCharacterEntity cc where cc.name=:na"),
		@NamedQuery(name = "findByNameAndCountryAndGenderAndAuthor", query = "select cc from CartoonCharacterEntity cc where "
				+ "cc.name=:na and cc.country=:co and cc.gender=:ge and cc.author=:au"),
		@NamedQuery(name = "findAuthorByName", query = "select cc.author from CartoonCharacterEntity cc where cc.name=:nm "),
		@NamedQuery(name = "findNameAndCountryByAuthor", query = "select cc.name ,cc.country from CartoonCharacterEntity cc where cc.author=:ar"),
		@NamedQuery(name = "findCreatedDateByAuthor", query = "select cc.createdDate from CartoonCharacterEntity cc where cc.author=:at"),
		@NamedQuery(name = "updateAuthorByName", query = "UPDATE  CartoonCharacterEntity cc set cc.author=:at where cc.name=:nm  "),
		@NamedQuery(name = "updateTypeByName", query = "UPDATE CartoonCharacterEntity cc set cc.type=:ty where  cc.name=:nm"),
		@NamedQuery(name = "deleteByName", query = "DELETE CartoonCharacterEntity cc where cc.name=:nm"),
		@NamedQuery(name = "total", query = "SELECT  count(*) from CartoonCharacterEntity cc "),
		@NamedQuery(name = "findByMaxCreatedDate", query = "SELECT MAX(createdDate) from CartoonCharacterEntity"),
		@NamedQuery(name = "findAll", query = "select cc from CartoonCharacterEntity cc"),
		@NamedQuery(name = "findAllByAuthor", query = "select cc from CartoonCharacterEntity cc where cc.author=:au"),
		@NamedQuery(name = "findAllByAuthorAndGender", query = "select cc from CartoonCharacterEntity cc where cc.author=:au and cc.gender=:ge "),
		@NamedQuery(name = "findAllCountry", query = "select cc.country from  CartoonCharacterEntity cc"),
		@NamedQuery(name = "findAllNameAndCountry", query = "select cc.name,cc.country from CartoonCharacterEntity cc"),
		@NamedQuery(name = "findAllName", query = "select cc.name from  CartoonCharacterEntity cc"),
		@NamedQuery(name = "findAllNameAndCountryAndAuthor", query = "select cc.name,cc.country,cc.author from CartoonCharacterEntity cc") })

public class CartoonCharacterEntity extends ParentEntity {
	@Id
	@GenericGenerator(name = "boss", strategy = "increment")
	@GeneratedValue(generator = "boss")
	private Integer pid;
	private String name;
	private String country;
	private String gender;
	private String author;
	private String type;

	public CartoonCharacterEntity(String name, String country, String gender, String author, String type,
			String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);

		this.name = name;
		this.country = country;
		this.gender = gender;
		this.author = author;
		this.type = type;
	}

}
