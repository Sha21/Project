package com.niit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.ProductDao;
import com.niit.model.Addcategory;
import com.niit.model.Addproduct;



@Service
@Transactional

public class ProductServiceImp implements ProductService {

	
	public ProductServiceImp()
	{
		System.out.println("productserviceImplementation object is created");
	}
	
	@Autowired
	private ProductDao productDao;
	
	public void saveProduct(Addproduct product) {
		// TODO Auto-generated method stub
		System.out.println("helll");
		productDao.saveProduct(product);
	}
	
	public List<Addproduct> getAllAddproducts() {
		// TODO Auto-generated method stub
		return productDao.getAllAddproducts();
		
	}

	public Addproduct getAddproductById(int id) {
		// TODO Auto-generated method stub
		return productDao.getAddproductById(id);
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		Addproduct product=getAddproductById(id);
		productDao.deleteProduct(product);
		
	}

	public void updateProduct(Addproduct product) {
		// TODO Auto-generated method stub
		productDao.editProduct(product);
		
	}

	public List<Addcategory> getAllCategories() {
		// TODO Auto-generated method stub
		return productDao.getAllCategories();
	}

	
	
}



