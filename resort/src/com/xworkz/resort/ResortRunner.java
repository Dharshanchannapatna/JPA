package com.xworkz.resort;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dao.ResortDao;
import com.xworkz.resort.dao.ResortDaoImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {
		ResortEntity resortEntity=new ResortEntity();
		resortEntity.setId(2);
		resortEntity.setName("Mango mist");
		resortEntity.setLocation("Kanakapura road");
		resortEntity.setCheckInTime(LocalTime.of(12, 00));
		resortEntity.setCheckOutTime(LocalTime.of(11, 00));
		resortEntity.setCreateBy("Nandan");
		resortEntity.setCreateDate(LocalDate.now());
		resortEntity.setOwner("Darshan");
		resortEntity.setPricePerDay(3000D);
		
		ResortDao dao=new ResortDaoImpl();
		Boolean y=dao.save(resortEntity);
		System.out.println(y);
		
	

	}

}
