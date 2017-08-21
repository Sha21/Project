package com.niit.Service;

import java.util.List;

import com.niit.model.Addcategory;
import com.niit.model.Addproduct;






public interface ProductService {

	void saveProduct(Addproduct product);
	
	List<Addproduct>getAllAddproducts();

	Addproduct getAddproductById(int id);
	
	void deleteProduct(int id);
	
	void updateProduct(Addproduct product);
	
	List<Addcategory>getAllCategories();
}


