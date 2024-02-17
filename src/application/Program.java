package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "teste");
		
		Seller seller = new Seller(1, "José", "jose@gmail.com", new Date(), 3500.0, dp);
		
		System.out.println(seller);
		

	}

}
