package com.company.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public interface BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
