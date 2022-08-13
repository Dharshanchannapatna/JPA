package com.xworkz.showroom;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.showroom.dao.ShowroomDao;
import com.xworkz.showroom.dao.ShowroomDaoImpl;
import com.xworkz.showroom.entity.ShowroomEntity;

public class ShowroomRunner {

	public static void main(String[] args) {
		ShowroomEntity entity = new ShowroomEntity(3, "Hunday", "Majestic", LocalTime.of(7, 00), LocalTime.of(5, 00),
				"preetham", LocalDate.now(), "Manohar", LocalDate.now());

		ShowroomDao dao = new ShowroomDaoImpl();
		// Boolean s = dao.save(entity);
		// System.out.println(s);
		// ShowroomEntity y=dao.findById(1);
		// System.out.println(y);
		// dao.updateNameAndCreatedByById("Creta", "Ambani", 1);
		dao.deleteById(3);

	}

}
