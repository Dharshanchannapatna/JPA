package com.xworkz.company;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.company.dao.CompanyDao;
import com.xworkz.company.dao.CompanyDaoImpl;
import com.xworkz.company.entity.CompanyEntity;

public class CompanyRunner {
	public static void main(String[] args) {
		CompanyEntity companyEntity=new CompanyEntity();
		companyEntity.setId(3);
		companyEntity.setName("Hcl_technologies");
		companyEntity.setLocation("Mysore");
		companyEntity.setCheckInTime(LocalTime.of(8, 00));
		companyEntity.setCheckOutTime(LocalTime.of(7, 00));
		companyEntity.setCreatedBy("Arjun");
		companyEntity.setCreatedDate(LocalDate.now());
		companyEntity.setUpdatedBy("Raghu");
		companyEntity.setUpdatedDate(LocalDate.now());
		
		
		CompanyDao dao=new CompanyDaoImpl();
		//Boolean saved=dao.save(companyEntity);
		//System.out.println(saved);
		//CompanyEntity y=dao.findById(1);
		//System.out.println(y);
		//dao.updateNameAndCreatedBYBYId("TCS", "RathanTata", 3);
		dao.deleteById(2);
		
	}
	
}
