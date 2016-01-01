package com.security.service.repository.core;

import java.util.List;

import org.hibernate.Criteria;

public interface SecurityRepository<T> {

	T findOne(Long id);
	
	List<T> findAll();
	
	List<T> findByCriteria(Criteria criteria);
}
