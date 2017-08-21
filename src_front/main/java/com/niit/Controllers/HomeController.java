package com.niit.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.Service.ProductService;



@Controller
public class HomeController {

	@Autowired
	private ProductService productService;
  
	@RequestMapping("/contactus")	
 	public String ContactUs()
 	{
 	  
 		return "contactus";
 	}
 
  
    @RequestMapping("/")	
	public String Home(HttpSession session)
	{
	  session.setAttribute("categories",productService.getAllCategories());
		return "home";
	}
	
    @RequestMapping("/login")
	public String Login(@RequestParam (required=false) String error,Model model)
	{
		
		if(error!=null)
			model.addAttribute("error","Invalid username/password");
		return "login";
	}
	
	//@RequestMapping("/admin")
	//public String Adminpage()
	//{
		//return "admin";
	//}
	
	@RequestMapping("/aboutus")
	public String AboutUs()
	{
		return "aboutus";
	}
	
	
	
}
