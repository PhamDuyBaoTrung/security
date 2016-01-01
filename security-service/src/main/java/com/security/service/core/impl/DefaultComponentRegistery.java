package com.security.service.core.impl;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.security.service.core.ComponentRegistery;
import com.security.service.core.DomainOrientedComponent;

public class DefaultComponentRegistery<COMPONENT extends DomainOrientedComponent<?>> implements ComponentRegistery<COMPONENT>, ApplicationContextAware{

	private ApplicationContext appctx;
	private ConcurrentMap<Class<?>, COMPONENT> cachedComponent = new ConcurrentHashMap<Class<?>, COMPONENT>(); {
	};
	protected String fallbackPrototypeBeanName;
	private Class<?> componentClass;
	
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		appctx = applicationContext;
		
	}

	public <T> COMPONENT forClass(Class<T> entityType) {
		COMPONENT result = (COMPONENT) cachedComponent.get(entityType);
		
		if(result == null) {
			result = (COMPONENT) appctx.getBean(fallbackPrototypeBeanName, new Object[] {entityType});
			cachedComponent.put(entityType, result);
		}
		return result;
	}

	public void setFallbackPrototypeBeanName(String fallbackPrototypeBeanName) {
		this.fallbackPrototypeBeanName = fallbackPrototypeBeanName;
	}

	public Class<?> getComponentClass() {
		return componentClass;
	}

	public void setComponentClass(Class<?> componentClass) {
		this.componentClass = componentClass;
	}
}
