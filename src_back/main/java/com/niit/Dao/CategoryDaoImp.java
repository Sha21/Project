/*package com.niit.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.niit.model.Addproduct;
import com.niit.model.Addcategory;
//import com.niit.model.Product;
import com.niit.model.Addproduct;
//import com.niit.model.Category;


@Repository
public class CategoryDaoImp implements CategoryDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void savecategory(Addcategory category) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(category);
	}

	
	public List<Addcategory> getAllAddcategories() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Addcategory");
		List<Addcategory> categorys=query.list();
		return categorys;
	}

	
	public Addcategory getAddcategoryById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Addcategory category=(Addcategory)session.get(Addcategory.class, id);
		return category;
	}

	public void deletecategory(Addcategory category) {
		// TODO Auto-generated method stub
		
		Session session=sessionFactory.getCurrentSession();
		session.delete(category);
	}

   

	public void editcategory(Addcategory category) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		//session.beginTransaction();
		session.update(category);
		//session.getTransaction().commit();
	}

	
	public List<Addproduct> getAllAddproducts() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Addproduct");
		List<Addproduct> products=query.list();
		return products;
	}

	
}
*/