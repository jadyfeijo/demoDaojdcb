package model.dao;

import db.DB;
import model.dao.Impl.DepartamentDaoJDBC;
import model.dao.Impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	public static DepartmentDao createDepartmentDao() {
		return new DepartamentDaoJDBC(DB.getConnection());
	}
}
