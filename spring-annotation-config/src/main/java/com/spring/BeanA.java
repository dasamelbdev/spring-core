package com.spring;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class BeanA {

    @Value("Lanka Lanka")
    private String myProperty;

    public String getMyProperty() {
        return myProperty;
    }

    //@Required
    //@Value("Lanka")
    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }

}