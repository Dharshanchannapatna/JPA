package com.xworkz.showroom.dao;

import com.xworkz.showroom.entity.ShowroomEntity;

public interface ShowroomDao {
	Boolean save(ShowroomEntity entity);

	ShowroomEntity findById(Integer id);

	void updateNameAndCreatedByById(String name, String createdBy, Integer id);

	void deleteById(Integer id);

}
