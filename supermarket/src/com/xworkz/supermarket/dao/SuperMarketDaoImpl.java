package com.xworkz.supermarket.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.supermarket.entity.SuperMarketEntity;
import static com.xworkz.supermarket.util.Factory.*;

public class SuperMarketDaoImpl implements SuperMarketDao {
	EntityManagerFactory factory = getFactory();

	@Override
	public Boolean save(SuperMarketEntity entity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();  
			manager.persist(entity);
			tx.commit();
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return null;

	}
}
