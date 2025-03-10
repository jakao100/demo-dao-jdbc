package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;
import java.util.Date;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

	}

}
