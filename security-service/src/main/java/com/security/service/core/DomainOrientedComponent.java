package com.security.service.core;

public interface DomainOrientedComponent<T> {
	Class<T> getDomainClass();
}
