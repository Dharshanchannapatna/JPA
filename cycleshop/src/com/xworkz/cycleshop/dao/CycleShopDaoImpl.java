package com.xworkz.cycleshop.dao;

import static com.xworkz.cycleshop.util.EMFUtil.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.xworkz.cycleshop.entity.CycleShopEntity;

public class CycleShopDaoImpl implements CycleShopDao {
	EntityManagerFactory factory = getFactory();

	@Override
	public Boolean save(CycleShopEntity entity) {

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
	public CycleShopEntity findByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query q = manager.createNamedQuery("findByName");
			q.setParameter("na", name);
			Object result = q.getSingleResult();
			CycleShopEntity b = (CycleShopEntity) result;
			return b;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CycleShopEntity findByLocationAndOwnerName(String location, String ownerName) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query q = manager.createNamedQuery("findByLocationAndOwnerName");
			q.setParameter("loc", location);
			q.setParameter("own", ownerName);
			Object result = q.getSingleResult();
			CycleShopEntity v = (CycleShopEntity) result;
			return v;

		} catch (Exception e) {

		} finally {

		}
		return null;
	}

}
