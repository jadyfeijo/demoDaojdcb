package model.dao;

import model.dao.Impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC();
	}
}
