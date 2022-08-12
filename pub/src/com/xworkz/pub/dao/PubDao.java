package com.xworkz.pub.dao;

import com.xworkz.pub.entity.PubEntity;

public interface PubDao {
	Boolean save(PubEntity entity);
	PubEntity findById(Integer pid);
	void UpdateNameAndLocationById(String newName,String newLocation,Integer pid);
     void deleteById(Integer pid);
}
