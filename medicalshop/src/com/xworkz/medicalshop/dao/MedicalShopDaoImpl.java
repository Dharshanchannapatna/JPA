package com.xworkz.medicalshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.medicalshop.entity.MedicalShopEntity;
import static com.xworkz.medicalshop.util.Factory.*;

public class MedicalShopDaoImpl implements MedicalShopDao {
	EntityManagerFactory factory = getFactory();

	@Override
	public Boolean addAll(List<MedicalShopEntity> entities) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();

			for (MedicalShopEntity medicalShopEntity : entities) {

				manager.persist(medicalShopEntity);

			}
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}

		return null;
	}

}
