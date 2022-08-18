package com.xworkz.cartooncharacter.dao;

import java.time.LocalDate;
import java.util.List;

import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;

public interface CartoonCharacterDao {
	Boolean addAll(List<CartoonCharacterEntity> entities);

	CartoonCharacterEntity findByName(String name);

	CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author);

	String findAuthorByName(String name);

	Object[] findNameAndCountryByAuthor(String author);

	LocalDate findCreatedDateByAuthor(String author);

	void updateAuthorByName(String newAuthor, String name);

	void updateTypeByName(String newType, String name);

	void deleteByName(String name);

	Long total();

	CartoonCharacterEntity findByMaxCreatedDate();

}
