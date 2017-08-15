/*package com.niit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.CategoryDao;
//import com.niit.Dao.ProductDao;
import com.niit.model.Addcategory;
import com.niit.model.Addproduct;

@Service
@Transactional

public class CategoryServiceImp implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	public void savecategory(Addcategory category) {
		// TODO Auto-generated method stub
		categoryDao.savecategory(category);
	}

	

	public Addcategory getAddcategoryById(int id) {
		// TODO Auto-generated method stub
		return categoryDao.getAddcategoryById(id);
	}

	public void deletecategory(int id) {
		// TODO Auto-generated method stub
		Addcategory category=getAddcategoryById(id);
		categoryDao.deletecategory(category);
	}

	public void updatecategory(Addcategory category) {
		// TODO Auto-generated method stub
		categoryDao.editcategory(category);
	}

	public List<Addcategory> getAllAddcategories() {
		// TODO Auto-generated method stub
		return categoryDao.getAllAddcategories();
	}

	public List<Addproduct> getAllAddproducts() {
		// TODO Auto-generated method stub
		return categoryDao.getAllAddproducts();
	}

}
*/