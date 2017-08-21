package com.niit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.CustomerDao;
import com.niit.model.Customer;
import com.niit.model.User;
//import com.niit.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImp implements CustomerService {

		@Autowired
		private CustomerDao customerDao;
		public Void registerCustomer(Customer customer) {
			// TODO Auto-generated method stub
			customerDao.registerCustomer(customer);
			return null;
		}
		public User validateUsername(String username) {
			// TODO Auto-generated method stub
			return customerDao.validateUsername(username);
		}
		public Customer validateEmail(String email) {
			// TODO Auto-generated method stub
			return customerDao.validateEmail(email);
		}
		public Customer getCustomerByUsername(String username) {
			// TODO Auto-generated method stub
			return customerDao.getCustomerByUsername(username);
		}

}
