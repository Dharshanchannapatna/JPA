package com.xworkz.hospital.dao;

import com.xworkz.hospital.entity.HospitalEntity;

public interface HospitalDao {
	Boolean save(HospitalEntity hospitalEntity);

	HospitalEntity findById(Integer id);

	void updateNameAndCreatedBYBYId(String name, String createdby, Integer id);

	void deleteById(Integer id);
}
