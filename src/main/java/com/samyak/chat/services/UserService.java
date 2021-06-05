package com.samyak.chat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.samyak.chat.dao.UserDao;
import com.samyak.chat.models.User;

@Service
@Transactional
public class UserService implements UserServiceInterface {

	@Autowired
	private UserDao userAdmin;
	
	@Override
	public List<String> getUsers() {
		// TODO Auto-generated method stub
		return userAdmin.getUsers();
	}

	@Override
	public void insertUser(String email, String password) {
		userAdmin.insertUser(email, password);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(String email, String password) {
		userAdmin.deleteUser(email, password);
		// TODO Auto-generated method stub

	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		List<User> ls = userAdmin.getUserById(id);
		if(ls.size()==1)
			return ls.get(0);
		return null;
	}

}
