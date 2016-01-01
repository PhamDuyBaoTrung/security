package com.security.service.core;

import java.util.List;

public interface GenericDomainService<T> extends DomainOrientedComponent<T> {
	/**
	 * save or update the given domain object
	 * @param entity
	 * @return
	 */
	T save(T entity);
	
	/**
	 * save or update list given domain object
	 * @param entities
	 * @return
	 */
	List<T> saveAll(List<T> entities);
	
	/**
	 * Retrive an Domain Object by using Id
	 * @param id
	 * @return
	 */
	T findOne(Long id);
}
