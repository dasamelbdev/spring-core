package model;

/**
 * Created by a212585123 on 7/31/17.
 */
public class StudentAutoWireByConstrcutor {


    private String name;
    private int age;
    private School schoolAutoWireByConstrctor;
    private Address addressAutoWireByConstrctor;


    StudentAutoWireByConstrcutor(School school, Address address) {
        System.out.println("school to string -->" + school.toString());
        this.schoolAutoWireByConstrctor = school;
        this.addressAutoWireByConstrctor = address;
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


    public School getSchoolAutoWireByConstrctor() {
        return schoolAutoWireByConstrctor;
    }

    public void setSchoolAutoWireByConstrctor(School schoolAutoWireByConstrctor) {
        this.schoolAutoWireByConstrctor = schoolAutoWireByConstrctor;
    }

    public Address getAddressAutoWireByConstrctor() {
        return addressAutoWireByConstrctor;
    }

    public void setAddressAutoWireByConstrctor(Address addressAutoWireByConstrctor) {
        this.addressAutoWireByConstrctor = addressAutoWireByConstrctor;
    }


    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.getAddressAutoWireByConstrctor().toString() + " " + this.getSchoolAutoWireByConstrctor().toString();
    }


}
