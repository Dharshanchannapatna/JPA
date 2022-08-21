package com.xworkz.supermarket.service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.supermarket.dao.SuperMarketDao;
import com.xworkz.supermarket.dao.SuperMarketDaoImpl;
import com.xworkz.supermarket.entity.SuperMarketEntity;
import static com.xworkz.supermarket.util.Validation.*;

import java.util.Set;

public class ServiceDaoImpl implements ServiceDao {
	SuperMarketDao dao = new SuperMarketDaoImpl();

	@Override
	public Boolean save(SuperMarketEntity entity) {
		ValidatorFactory factory = getFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SuperMarketEntity>> violations = validator.validate(entity);
		if (violations.size() > 0) {
			System.out.println("Invalid Detais");
			for (ConstraintViolation<SuperMarketEntity> violation2 : violations) {
				System.out.println(violation2.getMessage());
			}
		} else {
			System.out.println("Valid Object");
			dao.save(entity);
		}

		return null;
	}
}
