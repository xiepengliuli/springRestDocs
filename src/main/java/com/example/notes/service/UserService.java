package com.example.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notes.beans.User;
import com.example.notes.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	/**
	 * 保存
	 * @param user
	 * @return
	 */
	public User save(User user) {
		User save = userDao.save(user);
		return save;
	}
	
	
}
