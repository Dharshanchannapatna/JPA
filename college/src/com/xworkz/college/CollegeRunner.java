package com.xworkz.college;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.college.dao.CollegeDao;
import com.xworkz.college.dao.CollegeDaoImpl;
import com.xworkz.college.entity.CollegeEntity;

public class CollegeRunner {

	public static void main(String[] args) {
		CollegeEntity collegeRunner = new CollegeEntity(2, "BGSIT", "Chikkbalapur", LocalTime.of(9, 00),
				LocalTime.of(4, 00), "Nirmalananda swamy", LocalDate.now(), "Balagandara swamy", LocalDate.now());
		CollegeDao dao = new CollegeDaoImpl();
		// dao.save(collegeRunner);
		// CollegeEntity u=dao.findById(2);
		// System.out.println(u);
		// dao.updateNameAndCreatedBYBYId("ATME", "Nandan", 1);
		dao.deleteById(2);

	}

}
