package com.xworkz.theater;

import java.time.LocalDate;

import com.xworkz.theater.dao.TheaterDao;
import com.xworkz.theater.dao.TheaterDaoImpl;
import com.xworkz.theater.entity.TheaterEntity;

public class TheaterRunner {

	public static void main(String[] args) {
		TheaterEntity entity = new TheaterEntity(2, "Shivananda", "Channapatna", 4, 90.00, "Abhishek", LocalDate.now(),
				"Raghu", LocalDate.now());
		TheaterDao dao = new TheaterDaoImpl();
		// Boolean i = dao.save(entity);
		// System.out.println(i);

		// TheaterEntity e = dao.findById(1);
		// System.out.println(e);
		dao.deleteById(20);
	}

}
