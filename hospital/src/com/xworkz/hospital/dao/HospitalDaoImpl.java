package com.xworkz.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.hospital.entity.HospitalEntity;

public class HospitalDaoImpl implements HospitalDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public Boolean save(HospitalEntity hospitalEntity) {
		EntityManager manager = factory.createEntityManager();
		try {

			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(hospitalEntity);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public HospitalEntity findById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		try {
			HospitalEntity entity = manager.find(HospitalEntity.class, id);
			if (entity != null) {
				System.out.println("entity found :" + id);
				return entity;
			} else {
				System.out.println("entity not found");
			}

		} catch (Exception e) {

		}

		return null;
	}

	@Override
	public void updateNameAndCreatedBYBYId(String name, String createdBy, Integer id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		try {
			HospitalEntity entity = manager.find(HospitalEntity.class, id);
			if (entity != null) {

				System.out.println("entityfound:" + id);
				entity.setName(name);
				entity.setCreatedBy(createdBy);
				manager.merge(entity);
			} else {
				System.err.println("entity not found");
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
	public void deleteById(Integer id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		try {
			HospitalEntity entity = manager.find(HospitalEntity.class, id);
			if(entity !=null) {
				System.out.println("entity found:"+id);
				manager.remove(entity);
			}
			else {
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
