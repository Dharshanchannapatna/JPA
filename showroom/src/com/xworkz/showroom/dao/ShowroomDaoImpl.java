package com.xworkz.showroom.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.showroom.entity.ShowroomEntity;

public class ShowroomDaoImpl implements ShowroomDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public Boolean save(ShowroomEntity entity) {
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
	public ShowroomEntity findById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			ShowroomEntity entity = manager.find(ShowroomEntity.class, id);
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
			ShowroomEntity entity = manager.find(ShowroomEntity.class, id);
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
			ShowroomEntity entity = manager.find(ShowroomEntity.class, id);
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
