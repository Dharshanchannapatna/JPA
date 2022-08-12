package com.xworkz.pub;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.pub.dao.PubDao;
import com.xworkz.pub.dao.PubDaoImpl;
import com.xworkz.pub.entity.PubEntity;

public class PubRunner {
	public static void main(String[] args) {
		PubEntity pubEntity = new PubEntity();
		pubEntity.setPid(2);
		pubEntity.setName("Infinity");
		pubEntity.setLocation("Mangalore");
		pubEntity.setCheckInTime(LocalTime.of(1, 00));
		pubEntity.setCheckOutTime(LocalTime.of(2, 00));
		pubEntity.setCreatedBy("Darshi");
		pubEntity.setCreatedDate(LocalDate.now());
		pubEntity.setUpdatedBy("chandru");
		pubEntity.setUpdatedDate(LocalDate.now());

		PubDao dao = new PubDaoImpl();
		// Boolean y=dao.save(pubEntity);
		// System.out.println(y);

		// PubEntity u=dao.findById(2);
		// System.out.println(u);

		// dao.UpdateNameAndLocationById("Siri", "Ramanagara", 1);
		dao.deleteById(1);
	}

}
