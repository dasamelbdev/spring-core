package model;

/**
 * Created by a212585123 on 7/31/17.
 */
public class Student {

    private String name;
    private int age;
    private School school;
    private Address address;


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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.address.toString() + " " + this.school.toString();
    }
}
