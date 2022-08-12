package com.xworkz.pub.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.pub.entity.PubEntity;

public class PubDaoImpl implements PubDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public Boolean save(PubEntity entity) {

		try {

			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public PubEntity findById(Integer pid) {
		EntityManager manager = factory.createEntityManager();
		try {
			PubEntity entity = manager.find(PubEntity.class, pid);
			if (entity != null) {
				System.out.println("entity found:" + pid);
				return entity;
			} else {
				System.out.println("entity not found");
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			manager.close();
		}
		return null;

	}

	@Override
	public void UpdateNameAndLocationById(String newName, String newLocation, Integer pid) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();

			PubEntity entity = manager.find(PubEntity.class, pid);
			if (entity != null) {
				System.out.println("entity found:" + pid);

				entity.setName(newName);
				entity.setLocation(newLocation);
				manager.merge(entity);
			} else {
				System.out.println("entity not found");

			}

			tx.commit();
			System.out.println(entity);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Override
	public void deleteById(Integer pid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {	
		PubEntity entity = manager.find(PubEntity.class, pid);
		if(entity !=null) {
			manager.remove(entity);
		}
		else {
			System.out.println("Id Unable To Find");
		}
		tx.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}

	}
}