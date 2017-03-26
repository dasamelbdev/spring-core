package com.spring.practice.factory;

import com.spring.practice.model.Subject;
import org.apache.log4j.Logger;

/**
 * Created by dasun on 3/26/17.
 */
public class SubjectFactory {

    private static Logger log = Logger.getLogger(SubjectFactory.class);
    private static final String INSTRUTOR_NAME = "ins_2010";

    private SubjectFactory() {
        log.info("at SubjectFactory()");
    }

    public Subject getSuject() {
        Subject subject = new Subject();
        subject.setName(INSTRUTOR_NAME);
        return subject;

    }


}
