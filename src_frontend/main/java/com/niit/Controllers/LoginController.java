/*package com.niit.Controllers;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.Service.RegisterService;
//import com.niit.Dao.RegisterDao;
import com.niit.model.Usercredential;

@Controller
public class LoginController {

	
	@Autowired
	private RegisterService registerService;

	//@SuppressWarnings("unchecked")
		@RequestMapping(value="/login",method=RequestMethod.POST)
		public String login_session_attributes(HttpSession session,Model model) {
			System.out.println("Spring Security");
			String userid = SecurityContextHolder.getContext().getAuthentication().getName();
			Usercredential  user = registerService.getuserid(userid);
			session.setAttribute("userId", user.getUserid());
			session.setAttribute("password", user.getPassword());
			session.setAttribute("LoggedIn", "true");

			Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
			String page="";
			String role="ROLE_USER";
			for (GrantedAuthority authority : authorities) 
			{
			  
			     if (authority.getAuthority().equals(role)) 
			     {
			    	 session.setAttribute("UserLoggedIn", "true");
				 page="/home";
			    	 //session.setAttribute("cartsize",cartDAO.cartsize((int)session.getAttribute("userId")));
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