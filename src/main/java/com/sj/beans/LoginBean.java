package com.sj.beans;

import javax.faces.bean.ManagedBean;

/**
 * @author Sachin_Jain17
 *
 */
@ManagedBean
public class LoginBean {

	/**
	 * 
	 */
	private String userName;

	/**
	 * 
	 */
	private String password;
	
	/**
	 * 
	 */
	private String role;

		/**
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role
	 */
	public void setRole(String role) {
		this.role = role;
	}

}
