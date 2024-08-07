package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== Test 1: Seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===== Test 2: Seller findByDeparment =====");
		Department dep = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for(Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n===== Test 3: Seller findAll =====");
		list = sellerDao.findAll();
		
		for(Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n===== Test 4: Seller insert =====");
		Seller newSeller = new Seller(null, "Mafalda", "mafalda@gmail.com", new Date(), 4200.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted!  New id = " + newSeller.getId());
	
		System.out.println("\n===== Test 5: Seller update =====");
		seller = sellerDao.findById(3);
		seller.setName("Saímon da Silva");
		sellerDao.update(seller);
		System.out.println("Updated complete!");
		
		//*
		System.out.println("\n===== Test 6: Seller delete =====");
		System.out.print("Enter ID for delete test: ");
		int id = sc.nextInt();
		sellerDao.deletById(id);
		System.out.println("Delete completed!");//*/
		
		sc.close();
	}

}
