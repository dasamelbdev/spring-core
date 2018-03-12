package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class BeanA {

    @Value("Done")
    private String myProperty;
    @Qualifier
    private BeanB beanB;

    public String getMyProperty() {
        return myProperty;
    }
    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }

    public BeanB getBeanB() {
        return beanB;
    }
    @Autowired
    @Qualifier(value="second")
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}