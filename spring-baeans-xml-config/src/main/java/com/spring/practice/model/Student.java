package com.spring.practice.model;

/**
 * Created by dasun on 3/26/17.
 */
public class Student {


    private String name;
    private int age;
    private String school;
    private House house;






    public Student(String name, String school) {
        this.name = name;
        this.school = school;
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


    @Override
    public String toString() {
        return this.name+" "+this.age+" "+this.school+" "+this.house.toString();
    }
}
