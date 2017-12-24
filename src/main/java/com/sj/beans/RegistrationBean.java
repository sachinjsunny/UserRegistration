package com.sj.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sj.services.RegistrationService;

/**
 * @author Sachin_Jain17
 *
 */
@Component
@Scope("request")
@Entity
@Table(name = "UserDetails")
@ManagedBean(name = "registrationBean")
public class RegistrationBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4126305782819875524L;

	/**
	 * 
	 */
	private static Logger logger = Logger.getLogger(RegistrationBean.class);
	
	/**
	 * 
	 */
	@Id
	@GeneratedValue
	private Long id;

	/**
	 * 
	 */
	@Column(name = "userName")
	private String userName;

	/**
	 * 
	 */
	@Column(name = "password")
	private String password;

	/**
	 * 
	 */
	@Transient
	private String confirmPassword;

	/**
	 * 
	 */
	@Column(name = "firstName")
	private String firstName;

	/**
	 * 
	 */
	@Column(name = "lastName")
	private String lastName;

	/**
	 * 
	 */
	@Column(name = "email")
	private String email;

	/**
	 * 
	 */
	@Autowired
	private transient RegistrationService registrationService;

	/**
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

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
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * @param confirmPassword
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the registrationService
	 */
	public RegistrationService getRegistrationService() {
		return registrationService;
	}

	/**
	 * @param registrationService the registrationService to set
	 */
	public void setRegistrationService(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegistrationBean [id=");
		builder.append(id);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", confirmPassword=");
		builder.append(confirmPassword);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	public String registerUser() {
		logger.info(this.toString());
		getRegistrationService().registerUser(this);
		return "success";
	}
}