package com.niit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Addcategory {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String categoryName;
		private String categoryDescription;
		@OneToMany(mappedBy="category")
	   private List<Addproduct> products;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		
		public String getCategoryDescription() {
			return categoryDescription;
		}
		public void setCategoryDescription(String categoryDescription) {
			this.categoryDescription = categoryDescription;
		}
		
		public List<Addproduct> getProducts() {
			return products;
		}
		public void setProducts(List<Addproduct> products) {
			this.products = products;
		}
		@Override
		public String toString()
		{
			return this.id + " " +this.categoryName;
		}

}
