package com.lin.dao;

import com.lin.domain.User;

public interface UserDao {
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public User selectUserById(Integer userId);
}
