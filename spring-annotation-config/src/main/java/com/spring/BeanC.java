package com.spring;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class BeanC {

    @Value("at field")/**to inject the value to prop property we have to remove the Required annotation from setProp method*/
    private String prop;


    public String getProp() {
        return prop;
    }


    @Required/*this annotation will make setting a value to the prop property using setter method mandetory  */
    @Value("at method")
    public void setProp(String prop) {
        this.prop = prop;
    }

}
