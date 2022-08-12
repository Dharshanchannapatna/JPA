package com.xworkz.partyhall.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.partyhall.entity.PartyhallEntity;

public class PartyhallDaoImpl implements PartyhallDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public Boolean save(PartyhallEntity entity) {
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
	public PartyhallEntity findById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			PartyhallEntity entity = manager.find(PartyhallEntity.class, id);
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
	public void updateNameAndCreatedByById(String name, String createdBy, Integer id) {
		EntityManager manager = factory.createEntityManager();

		try {
			PartyhallEntity entity = manager.find(PartyhallEntity.class, id);
			if (entity != null) {
				System.out.println("entity found:" + id);

				EntityTransaction tx = manager.getTransaction();
				tx.begin();
				entity.setName(name);
				entity.setCreatedBy(createdBy);
				tx.commit();
				manager.merge(entity);
				System.out.println(entity);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
	}

	@Override
	public void deleteById(Integer id) {
		EntityManager manager = factory.createEntityManager();

		try {
			PartyhallEntity entity = manager.find(PartyhallEntity.class, id);
			EntityTransaction tx = manager.getTransaction();
			tx.begin();

			if (entity != null) {
				System.out.println("entity found:" + id);
				manager.remove(entity);

				System.out.println(entity);

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
