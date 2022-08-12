package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;

public interface CompanyDao {
	Boolean save(CompanyEntity entity);
	CompanyEntity findById(Integer id);
	void updateNameAndCreatedBYBYId(String name,String createdBy,Integer id);
	void deleteById(Integer id);
	
}
