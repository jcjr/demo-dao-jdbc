package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== Test 1: Seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===== Test 2: Seller findByDeparment =====");
		Department dep = new Department(3, null);
		List<Seller> list = sellerDao.findByDepatment(dep);
		for(Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n===== Test 3: Seller findAll =====");
		list = sellerDao.findAll();
		for(Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n===== Test 4: Seller insert =====");
		Seller newSeller = new Seller(null, "Matheus", "matheurs@gmail.com", new Date(), 3800.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted!  New id = " + newSeller.getId());
		
		System.out.println("\n===== Test 5: Seller update =====");
		seller = sellerDao.findById(3);
		seller.setName("Eric Rian");
		seller.setEmail("ericrian@gmail.com");
		sellerDao.update(seller);
		System.out.println("Updated complete!");
		
	}

}
