package com.spring.practice.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by dasun on 3/28/17.
 */
public class SingletonScopeBean implements ApplicationContextAware {

    private PrototypeBean prototypeBean;
    private ApplicationContext applicationContext;

    public PrototypeBean getPrototypeBean() {
        PrototypeBean prototypeBean = this.applicationContext.getBean("prototypeBanId", PrototypeBean.class);
        return prototypeBean;
    }

    public void setPrototypeBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
