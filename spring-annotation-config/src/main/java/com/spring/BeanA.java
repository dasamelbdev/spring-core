package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import com.spring.*;
import org.springframework.beans.factory.annotation.Qualifier;

public class BeanA {

    private String myProperty;

    @Autowired
    //@Qualifier("second")/**we are giving the value of the qualifier here*/
    @Qualifier("beanB1")//if the qualifier tag is not included in the bean definition we can give the bean id as qualifier value
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
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}