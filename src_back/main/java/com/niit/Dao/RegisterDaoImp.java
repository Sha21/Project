/*package com.niit.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Register;
import com.niit.model.Usercredential;

@Repository
public class RegisterDaoImp implements RegisterDao  {

	@Autowired
	private SessionFactory sessionFactory;
	public void addUser(Register reg) {
		// TODO Auto-generated method stub
		
			System.out.println("Register DAO");
			System.out.println(reg.getName());
		    Usercredential user=new Usercredential();
			user.setUserid(reg.getUserid());
			user.setPassword(reg.getPassword());
			//System.out.println(r.getUserid());
			System.out.println("User Credentials");
			try
			{
			Session session= sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			//tx.begin();
			//session.beginTransaction();
			session.save(reg);
			session.save(user);
			tx.commit();
			session.flush();
			session.close();
			
			}
			
			catch(Exception e)
			{
				
				System.out.println("Error"+e);
			}
		
		
	}
	
	public Register getInfo(String username) {
		// TODO Auto-generated method stub
		try
		{		
		Session session = sessionFactory.openSession();
	      Transaction tx = session.getTransaction();
	      tx.begin();
	      Register regs=(Register) session.get(Register.class,username);
	      System.out.println(regs);
	      tx.commit();
	      return regs;
		}
	      catch(Exception e)
			{
				System.out.println("Error"+e);
			}
		return null;
	}

	public  Usercredential getuserid(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	//public static UserDetails get(String username) {
		// TODO Auto-generated method stub
		//return null;
	//}
	
	
	public Usercredential getUserById(String userid) {
		return (Usercredential) sessionFactory.getCurrentSession().get(Usercredential.class, userid);
	}

	public Register getUserByName(String name) {
		return (Register) sessionFactory.getCurrentSession().createQuery("from User where name='"+name+"'").uniqueResult();
	}
}
*/