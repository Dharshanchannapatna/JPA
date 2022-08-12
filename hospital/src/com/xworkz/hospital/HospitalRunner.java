package com.xworkz.hospital;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.hospital.dao.HospitalDao;
import com.xworkz.hospital.dao.HospitalDaoImpl;
import com.xworkz.hospital.entity.HospitalEntity;

public class HospitalRunner {

	public static void main(String[] args) {
		HospitalEntity hospitalEntity = new HospitalEntity();
		hospitalEntity.setId(3);
		hospitalEntity.setName("Apallo");
		hospitalEntity.setLocation("Chennai");
		hospitalEntity.setCheckInTime(LocalTime.of(4, 00));
		hospitalEntity.setCheckOutTime(LocalTime.of(6, 00));
		hospitalEntity.setCreatedBy("Bommai");
		hospitalEntity.setCreatedDate(LocalDate.now());
		hospitalEntity.setUpdatedBy("Chandru");
		hospitalEntity.setUpdatedDate(LocalDate.now());

		HospitalDao dao = new HospitalDaoImpl();
		// Boolean saved = dao.save(hospitalEntity);
		// System.out.println(saved);
		// HospitalEntity t=dao.findById(2);
		// System.out.println(t);
		//dao.updateNameAndCreatedBYBYId("Portis", "Sm Krishna", 1);
		dao.deleteById(1);
	}

}
