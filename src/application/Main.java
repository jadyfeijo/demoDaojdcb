package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {

		Departament obj = new Departament(1,"Books");
		Seller seller = new Seller (21,"Bob","bob@gmail",new Date(),3000.5,obj);
		System.out.println(seller);
		
	}

}
