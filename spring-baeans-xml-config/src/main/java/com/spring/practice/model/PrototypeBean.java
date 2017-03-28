package com.spring.practice.model;

import org.apache.log4j.Logger;

/**
 * Created by dasun on 3/27/17.
 */
public class PrototypeBean {

    private int index;
    private static Logger log = Logger.getLogger(PrototypeBean.class);

    public PrototypeBean() {
        log.info("at PrototypeBean()");
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
