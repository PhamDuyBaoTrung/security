package com.security.service.core.impl;

import com.security.service.core.GenericDomainService;
import com.security.service.core.ServiceRegistery;

public class SecurityServiceRegistery extends DefaultComponentRegistery<GenericDomainService<?>> implements ServiceRegistery {
	@Override
	public <T> GenericDomainService<T> forClass(Class<T> entityClass) {
		return (GenericDomainService<T>) super.forClass(entityClass);
	}
}
