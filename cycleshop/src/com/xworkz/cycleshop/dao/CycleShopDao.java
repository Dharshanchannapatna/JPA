package com.xworkz.cycleshop.dao;

import com.xworkz.cycleshop.entity.CycleShopEntity;

public interface CycleShopDao {
	Boolean save(CycleShopEntity entity);

	CycleShopEntity findByName(String name);
	
	CycleShopEntity findByLocationAndOwnerName(String location,String ownerName);

}
