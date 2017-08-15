package com.niit.InteriorDes_back;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Configuration.DBConfiguration;
//import com.niit.Dao.CategoryDaoImp;
import com.niit.Dao.CustomerDaoImp;
import com.niit.Dao.ProductDaoImp;
//import com.niit.Service.CategoryServiceImp;
import com.niit.Service.CustomerServiceImp;
//import com.niit.Dao.RegisterDaoImp;
//import com.niit.Service.ProductService;
import com.niit.Service.ProductServiceImp;
//import com.niit.Service.RegisterServiceImp;
//import com.niit.model.Addproduct;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImp.class,ProductServiceImp.class,CustomerDaoImp.class,CustomerServiceImp.class);
   
     /* ProductService productservice=(ProductService)context.getBean("ProductServiceImp");
      Addproduct product=new Addproduct();
      product.setProductName("Lord Krishna with Flute Cute Kids Room God Wall Sticker");
      product.setPrice(139);
      product.setQuantity(20);
      product.setDescription("PVC Vinyl");
      productservice.saveProduct(product);*/
    
    }
}
