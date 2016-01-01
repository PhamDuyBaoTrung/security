package com.security.service.repository.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

public class SecurityLocalSessionFactoryBean extends LocalSessionFactoryBean {
	@Override
	protected SessionFactory buildSessionFactory() throws Exception {
		return super.buildSessionFactory();
	}
}
