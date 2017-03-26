package com.spring.practice.model;

import java.util.Calendar;

/**
 * Created by dasun on 3/26/17.
 */
public class Student {


    private String name;
    private int age;
    private String school;
    private House house;
    private Calendar currentYear;
    private Subject subject;


    public Student(String name, String school, Calendar currentYear) {
        this.name = name;
        this.school = school;
        this.setCurrentYear(currentYear);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }


    public Calendar getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(Calendar currentYear) {
        this.currentYear = currentYear;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.school + " " + this.house.toString() + " " + this.currentYear.get(Calendar.YEAR) + " " + this.subject.getName();

    }


}