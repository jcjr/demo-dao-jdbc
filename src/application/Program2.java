package application;


import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("===== Test 1: Department findById =====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n===== Test 2: Department findAll =====");
		List<Department> list = departmentDao.findAll();
		
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n===== Test 3: Department insert =====");
		Department newDepartment = new Department(null, "Tools");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted!  New id = " + newDepartment.getId());
		
		System.out.println("\n===== Test 4: Department update =====");
		department = departmentDao.findById(3);
		department.setName("Music");
		departmentDao.update(department);
		System.out.println("Updated complete!");
		
		System.out.println("\n===== Test 5: Department delete =====");
		System.out.print("Enter ID for delete test: ");
		int id = sc.nextInt();
		departmentDao.deletById(id);
		System.out.println("Delete completed!");//*/
		
		sc.close();
	}

}
