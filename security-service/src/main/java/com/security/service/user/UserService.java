package com.security.service.user;

import com.security.person.User;

public interface UserService {
	/**
	 * Retrive User using userName and passWord
	 * @param userName
	 * @param passWord
	 * @return
	 */
	User getUserUsingUserNameAndPassword(String userName, String passWord);
}
