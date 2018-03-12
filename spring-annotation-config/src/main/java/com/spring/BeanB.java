package com.spring;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class BeanB {

    private String message;


    public String getMessage() {
        return message;
    }

    @Required
    @Value("Hello from beanB")
    public void setMessage(String message) {
        this.message = message;
    }
}
