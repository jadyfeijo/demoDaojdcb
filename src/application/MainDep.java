package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Departament;

public class MainDep {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==Tets Find By Id===");
		Departament dep2=depDao.findById(1);
		System.out.println(dep2);
				
		System.out.println("=== Insert Dep ===");
		
		Departament dep = new Departament(null,"Java");
		depDao.insert(dep);
		System.out.println("Inserted! New id = "+dep.getId());
		
		
		
		System.out.println("=== Update Dep ===");
		dep = depDao.findById(2);
		dep.setName("Novo dep");
		depDao.update(dep);
		
		System.out.println("Update complete");
		
		System.out.println("=== DELETE Dep");
		depDao.deleteById(6);
		
		System.out.println("=== Find All dep ===");
		List<Departament> list = depDao.findAll();
		for(Departament d:list)
		{
			System.out.println(d);
		}
			

			
	}

}
