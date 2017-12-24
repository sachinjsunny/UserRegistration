/**
 * 
 */
package com.sj.services.impl;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sj.beans.RegistrationBean;
import com.sj.services.RegistrationService;

/**
 * @author Sachin_Jain17
 *
 */
@Repository
public class RegistrationServiceImpl implements RegistrationService {
	
	private static Logger logger = Logger.getLogger(RegistrationServiceImpl.class);
	
	/**
	 * 
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	/* (non-Javadoc)
	 * @see com.sj.services.RegistrationService#registerUser(com.sj.beans.RegistrationBean)
	 */
	@Transactional
	public void registerUser(RegistrationBean registrationBean){
		logger.info(registrationBean.toString());
		Session session = sessionFactory.getCurrentSession();
		
		session.save(registrationBean);
	}
}
