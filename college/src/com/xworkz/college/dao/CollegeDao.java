package com.xworkz.college.dao;

import com.xworkz.college.entity.CollegeEntity;

public interface CollegeDao {
	Boolean save(CollegeEntity entity);

	CollegeEntity findById(Integer id);

	void updateNameAndCreatedBYBYId(String name, String createdBy, Integer id);

	void deleteById(Integer id);
}
