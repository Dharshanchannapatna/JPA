import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartooncharacter.dao.CartoonCharacterDao;
import com.xworkz.cartooncharacter.dao.CartoonCharacterDaoImpl;
import com.xworkz.cartooncharacter.entity.CartoonCharacterEntity;

public class Runner {

	public static void main(String[] args) {
		CartoonCharacterEntity entity = new CartoonCharacterEntity("Doreman", "USA", "male", "Kalyan", "comedy",
				"Darshan", LocalDate.now(), "Chandru", LocalDate.now());

		CartoonCharacterEntity entity1 = new CartoonCharacterEntity("Chota Beem", "Europe", "male", "Manoj", "comedy",
				"Darshan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity2 = new CartoonCharacterEntity("Tom Jerry", "Japan", "male", "Sharan", "Drama",
				"Darshan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity3 = new CartoonCharacterEntity("Spider man", "Uk", "male", "Arjun", "Action",
				"Darshan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity4 = new CartoonCharacterEntity("Super man", "China", "male", "Nandesh", "Action",
				"Darshan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity5 = new CartoonCharacterEntity("Mickey mouse", "India", "male", "Rajesh", "comedy",
				"Darshan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity6 = new CartoonCharacterEntity("Chutki ", "Korea", "female", "Nandan", "comedy",
				"Darshan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterEntity entity7 = new CartoonCharacterEntity("Raju ", "Germany", "male", "Dinga", "comedy",
				"Darshan", LocalDate.now(), "Chandru", LocalDate.now());
		CartoonCharacterDao dao = new CartoonCharacterDaoImpl();
		List<CartoonCharacterEntity> entities = new ArrayList();

		entities.add(entity);
		entities.add(entity1);
		entities.add(entity3);
		entities.add(entity4);
		entities.add(entity5);
		entities.add(entity6);

		entities.add(entity7);
		// dao.addAll(entities);

		// CartoonCharacterEntity u = dao.findByName("Super man");
		// System.out.println(u);
		// CartoonCharacterEntity cartoonCharacterEntity =
		// dao.findByNameAndCountryAndGenderAndAuthor("Mickey mouse",
		// "India", "male", "Rajesh");
		// System.out.println(cartoonCharacterEntity);
		// String y = dao.findAuthorByName("Super man");
		// System.out.println(y);
//		Object[] objects = dao.findNameAndCountryByAuthor("Arjun");
//		System.out.println(objects[0]);
//		System.out.println(objects[1]);

		// LocalDate l = dao.findCreatedDateByAuthor("Nandan");
		// System.out.println(l);
		// dao.updateAuthorByName("Tarun", "Doreman");
		// dao.updateTypeByName("funny", "Doreman");
		// dao.deleteByName("Raju");
//		Long co = dao.total();
//		System.out.println(co);
//		CartoonCharacterEntity v = dao.findByMaxCreatedDate();
//		System.out.println(v);
//		dao.findAll().forEach(System.out::println);
//		dao.findAllByAuthor("Nandan").forEach(System.out::println);
//		dao.findAllByAuthorAndGender("Nandan", "female").forEach(System.out::println);
//		dao.findAllCountry().forEach(System.out::println);
//		dao.findAllName().forEach(System.out::println);
//		dao.findAllNameAndCountry().forEach(obj->System.out.println(obj[0]+"::"+obj[1]));
		dao.findAllNameAndCountryAndAuthor().forEach(obj -> System.out.println(obj[0] + "::" + obj[1] + "::" + obj[2]));

	}
}
