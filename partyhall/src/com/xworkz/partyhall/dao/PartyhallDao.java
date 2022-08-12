package com.xworkz.partyhall.dao;

import com.xworkz.partyhall.entity.PartyhallEntity;

public interface PartyhallDao {
	Boolean save(PartyhallEntity entity);

	PartyhallEntity findById(Integer id);

	void updateNameAndCreatedByById(String name, String createdBy, Integer id);

	void deleteById(Integer id);
}
