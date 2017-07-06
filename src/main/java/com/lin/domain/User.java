package com.lin.domain;

/**
 * User映射类
 * 
 * @author wangbin
 *
 */
public class User {
	/**  */
	private Integer userId;

	/**  */
	private String userName;

	/**  */
	private String userPassword;

	/**  */
	private String userEmail;

	/**
	 * 
	 * @return USER_ID
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 
	 * @param userId
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 
	 * @return USER_NAME
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * 
	 * @return USER_PASSWORD
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * 
	 * @param userPassword
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword == null ? null : userPassword.trim();
	}

	/**
	 * 
	 * @return USER_EMAIL
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * 
	 * @param userEmail
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail == null ? null : userEmail.trim();
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + "]";
	}
}
