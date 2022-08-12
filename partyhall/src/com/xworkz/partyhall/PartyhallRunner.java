package com.xworkz.partyhall;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.partyhall.dao.PartyhallDao;
import com.xworkz.partyhall.dao.PartyhallDaoImpl;
import com.xworkz.partyhall.entity.PartyhallEntity;

public class PartyhallRunner {

	public static void main(String[] args) {
		PartyhallEntity entity = new PartyhallEntity(3, "Balagi", "Mysore", LocalTime.of(12, 00), LocalTime.of(4, 00),
				"Drupesh", LocalDate.now(), "Yashwanth", LocalDate.now());

		PartyhallDao dao = new PartyhallDaoImpl();

		// Boolean saved = dao.save(entity);
		// System.out.println(saved);

		// PartyhallEntity entity2=dao.findById(1);
		// System.out.println(entity2);
		// dao.updateNameAndCreatedByById("Krishna convention hall", "Malatesh", 1);

		dao.deleteById(2);

	}

}
