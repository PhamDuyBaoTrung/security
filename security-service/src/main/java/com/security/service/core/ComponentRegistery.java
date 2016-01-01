package com.security.service.core;

public interface ComponentRegistery<COMPONENT extends DomainOrientedComponent<?>> {
	/**
	 * Get a component with COMPONENT type for special Domain Class
	 * @param entityType
	 * @return
	 */
	<T> COMPONENT forClass(Class<T> entityType);
}
