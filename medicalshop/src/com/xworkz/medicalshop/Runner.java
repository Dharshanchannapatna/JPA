package com.xworkz.medicalshop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.medicalshop.dao.MedicalShopDao;
import com.xworkz.medicalshop.dao.MedicalShopDaoImpl;
import com.xworkz.medicalshop.entity.MedicalShopEntity;

public class Runner {

	public static void main(String[] args) {
		MedicalShopEntity entity = new MedicalShopEntity(1, "BN", "BTM", "Manoj", "Darshan", LocalDateTime.now(),
				"Nandan", LocalDateTime.now());

		MedicalShopEntity entity1 = new MedicalShopEntity(2, "BN", "BTM", "Manoj", "Darshan", LocalDateTime.now(),
				"Nandan", LocalDateTime.now());
		MedicalShopEntity entity3 = new MedicalShopEntity(3, "BN", "BTM", "Manoj", "Darshan", LocalDateTime.now(),
				"Nandan", LocalDateTime.now());
		MedicalShopDao dao = new MedicalShopDaoImpl();
		List<MedicalShopEntity> entities = new ArrayList<>();
		entities.add(entity);
		entities.add(entity1);
		entities.add(entity3);

	dao.addAll(entities);

	}

}
