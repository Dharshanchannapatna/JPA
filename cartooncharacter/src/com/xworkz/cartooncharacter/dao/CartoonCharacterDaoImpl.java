package com.xworkz.cartooncharacter.dao;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;
import static com.xworkz.cartooncharacter.util.Factory.*;

public class CartoonCharacterDaoImpl implements CartoonCharacterDao {
	EntityManagerFactory factory = getFactory();

	@Override
	public Boolean addAll(List<CartoonCharacterEntity> entities) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (CartoonCharacterEntity cartoonCharacterEntity : entities) {
				manager.persist(cartoonCharacterEntity);

			}
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public CartoonCharacterEntity findByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("na", name);
			Object result = query.getSingleResult();
			if (result != null) {
				CartoonCharacterEntity entity = (CartoonCharacterEntity) result;
				return entity;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public CartoonCharacterEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameAndCountryAndGenderAndAuthor");
			query.setParameter("na", name);
			query.setParameter("co", country);
			query.setParameter("ge", gender);
			query.setParameter("au", author);
			Object object = query.getSingleResult();
			if (object != null) {
				CartoonCharacterEntity characterEntity = (CartoonCharacterEntity) object;
				return characterEntity;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public String findAuthorByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAuthorByName");
			query.setParameter("nm", name);
			Object object = query.getSingleResult();
			if (object != null) {
				String entity = (String) object;
				return entity;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Object[] findNameAndCountryByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findNameAndCountryByAuthor");
			query.setParameter("ar", author);
			Object result = query.getSingleResult();
			if (result != null) {
				Object[] objects = (Object[]) result;
				return objects;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public LocalDate findCreatedDateByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findCreatedDateByAuthor");
			query.setParameter("at", author);
			Object result = query.getSingleResult();
			if (result != null) {
				LocalDate objects = (LocalDate) result;
				return objects;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateAuthorByName(String newAuthor, String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateAuthorByName");
			query.setParameter("nm", name);
			query.setParameter("at", newAuthor);

			query.executeUpdate();
			tx.commit();
		} catch (Exception e) {

		} finally {
			manager.close();

		}

	}

	@Override
	public void updateTypeByName(String newType, String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateTypeByName");
			query.setParameter("ty", newType);
			query.setParameter("nm", name);

			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {

		} finally {
			manager.close();

		}

	}

	@Override
	public void deleteByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("nm", name);
			query.executeUpdate();
			tx.commit();

		} catch (Exception e) {

		} finally {
			manager.close();

		}

	}

	@Override
	public Long total() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("total");

			Object object = query.getSingleResult();

			System.out.println(object);
			if (object != null) {

				Long u = (Long) object;
				return u;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonCharacterEntity findByMaxCreatedDate() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByMaxCreatedDate");
			Object object = query.getSingleResult();
			System.out.println(object);
			if (object != null) {
				CartoonCharacterEntity cartoonEntity = (CartoonCharacterEntity) object;
				return cartoonEntity;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public List<CartoonCharacterEntity> findAll() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAll");
			List<CartoonCharacterEntity> result = query.getResultList();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<CartoonCharacterEntity> findAllByAuthor(String author) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllByAuthor");
			query.setParameter("au", author);
			List<CartoonCharacterEntity> result = query.getResultList();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<CartoonCharacterEntity> findAllByAuthorAndGender(String author, String gender) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllByAuthorAndGender");
			query.setParameter("au", author);
			query.setParameter("ge", gender);
			List<CartoonCharacterEntity> result = query.getResultList();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<String> findAllCountry() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllCountry");
			List<String> result = query.getResultList();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Object[]> findAllNameAndCountry() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllNameAndCountry");
			List<Object[]> result = query.getResultList();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public List<String> findAllName() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllName");
			List<String> result = query.getResultList();
			if (result != null) {
				return result;

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

	@Override
	public List<Object[]> findAllNameAndCountryAndAuthor() {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAllNameAndCountryAndAuthor");
			List<Object[]> result = query.getResultList();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

}
