/*package com.niit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.RegisterDao;
import com.niit.model.Register;
import com.niit.model.Usercredential;

@Service
@Transactional
public class RegisterServiceImp implements RegisterService{

	@Autowired
	private RegisterDao registerDao;
	public void addUser(Register reg) {
		// TODO Auto-generated method stub
		registerDao.addUser(reg);
		
		
	}
	public Register getInfo(String username) {
		// TODO Auto-generated method stub
		return registerDao.getInfo(username);
	}
	
	public Usercredential getuserid(String userid) {
		// TODO Auto-generated method stub
		return registerDao.getuserid(userid);
	}
	
	public Usercredential getUserById(String userid) {
		// TODO Auto-generated method stub
		return registerDao.getUserById(userid);
	}
	public Register getUserByName(String name) {
		// TODO Auto-generated method stub
		return registerDao.getUserByName(name);
	}

}
*/