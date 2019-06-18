package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		System.out.println("===TEST 1: seller findById ====");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===TEST 2: seller findByDepartment ====");
		Departament department = new Departament(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj:list)
		{
			System.out.println(obj);
		}
		
		System.out.println("\n===TEST 3: seller findByAll ====");
		list = sellerDao.findAll();
		
		for(Seller obj:list)
		{
			System.out.println(obj);
		}
		
		System.out.println("\n===TEST 4: seller Insert ====");
		
		Seller newSeller = new Seller(null,"greg","greg@gmail",new Date(),4000.0,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+newSeller.getId());
		
		System.out.println("\n===TEST 5: seller Update ====");
		
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		
		System.out.println("Update complete");
		
		System.out.println("\n===TEST 6: seller Delete ====");
		int id =sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Completed");
		
		sc.close();
		


	}

}
