package com.lin.service;

import com.lin.domain.User;

/**
 * UserService接口类
 * 
 * @author wangbin
 *
 */
public interface UserService {
	User selectUserById(Integer userId);
}
