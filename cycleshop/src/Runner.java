import java.time.LocalDate;

import com.xworkz.cycleshop.dao.CycleShopDao;
import com.xworkz.cycleshop.dao.CycleShopDaoImpl;
import com.xworkz.cycleshop.entity.CycleShopEntity;

public class Runner {

	public static void main(String[] args) {
		CycleShopEntity entity = new CycleShopEntity();
		entity.setId(4);
		entity.setName("Hero");
		entity.setLocation("JayNagar");
		entity.setOwnerName("Maltesh");
		entity.setCreatedDate(LocalDate.now());
		entity.setUpdatedBy("Abhishek");
		entity.setUpdatedDate(LocalDate.now());
		CycleShopDao dao = new CycleShopDaoImpl();
		// Boolean i = dao.save(entity);
		// System.out.println(i);
		// CycleShopEntity u = dao.findByName("Atlas");
		// System.out.println(u);
		CycleShopEntity b = dao.findByLocationAndOwnerName("JayNagar", "Maltesh");
		System.out.println(b);

	}

}
