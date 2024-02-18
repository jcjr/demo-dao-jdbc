package application;

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
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepatment(dep);
		for(Seller sel : list) {
			System.out.println(sel);
		}
		
	}

}
