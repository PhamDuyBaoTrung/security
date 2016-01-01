package com.security.service.core;

public interface ServiceRegistery extends ComponentRegistery<GenericDomainService<?>>{
	<T> GenericDomainService<T> forClass(Class<T> entity);
}
