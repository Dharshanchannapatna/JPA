package com.xworkz.theater.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.theater.entity.TheaterEntity;

public class TheaterDaoImpl implements TheaterDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public Boolean save(TheaterEntity entity) {
		EntityManager manager = factory.createEntityManager();
		try {

			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return true;
	}

	@Override
	public TheaterEntity findById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			TheaterEntity entity = manager.find(TheaterEntity.class, id);
			if (entity != null) {
				System.out.println("entity found:" + id);
				return entity;
			} else {
				System.out.println("entity not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		EntityManager manager = factory.createEntityManager();

		try {
			TheaterEntity entity = manager.find(TheaterEntity.class, id);
			EntityTransaction tx = manager.getTransaction();
			tx.begin();

			if (entity != null) {
				System.out.println("entity found:" + id);
				manager.remove(entity);

				System.out.println(entity);

			} else {
				System.out.println("entity not found");
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			manager.close();
		}

	}

}
