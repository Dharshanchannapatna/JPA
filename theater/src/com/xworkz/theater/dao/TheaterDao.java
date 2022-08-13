package com.xworkz.theater.dao;

import com.xworkz.theater.entity.TheaterEntity;

public interface TheaterDao {
	Boolean save(TheaterEntity entity);

	TheaterEntity findById(Integer id);

	void deleteById(Integer id);

}
