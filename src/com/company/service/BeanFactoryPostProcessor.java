package com.company.service;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory);

}
