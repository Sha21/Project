/*package com.niit.Controllers;

//import java.util.Collection;

//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Service.RegisterService;
import com.niit.model.Register;
//import com.niit.model.Usercredential;
//import com.niit.model.Usercredential;

@Controller
public class RegisterController {

	
	//@Autowired
	//Usercredential user;
	
	@Autowired
	private RegisterService registerService;
	
	

    @RequestMapping("/Register")
		
	public ModelAndView getLogin(@ModelAttribute("register") Register register)
	{
	       System.out.println("Register");	
           ModelAndView model=new ModelAndView("register");
           return model;
		
	}
		
	@RequestMapping("/register")
    public ModelAndView Success(Register regg, Model mod)
		{
				registerService.addUser(regg);
				ModelAndView model=new ModelAndView("register","Register", new Register());
				return model;
		}
		
	
	 
	 @RequestMapping("/Login")
		
		public ModelAndView Login()
		{
		       System.out.println("login");	
	           ModelAndView model=new ModelAndView("login");
	           return model;
			
		}
	 
	 @RequestMapping("/login")
	 //@RequestMapping(value = "/loginsuccess")
	 public String login_session_attributes(HttpSession session,Model model) {
	 	String userid = SecurityContextHolder.getContext().getAuthentication().getName();
	 	//Usercredential  user = registerService.get(userid);
	 	Usercredential  user = registerService.getuserid(userid);
	 	session.setAttribute("userId", user.getUserid());
	 	session.setAttribute("password", user.getPassword());
	 	session.setAttribute("LoggedIn", "true");

	 	Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()	.getAuthentication().getAuthorities();
	 	String page="";
	 	String role="ROLE_USER";
	 	for (GrantedAuthority authority : authorities) 
	 	{
	 	  
	 	     if (authority.getAuthority().equals(role)) 
	 	     {
	 	    	 session.setAttribute("UserLoggedIn", "true");
	 		 //page="/addToCart";
	 	    	 page="/AddProduct";
	 	    	 //session.setAttribute("cartsize",cartdao.cartsize((int)session.getAttribute("userId")));
	 	     }
	 	     else 
	 	     {
	 	    	 session.setAttribute("Admin", "true");
	 		
	 	    }
	 	}
	 	return page;
	 }
		

}
*/