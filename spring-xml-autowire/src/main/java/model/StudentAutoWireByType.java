package model;

/**
 * Created by a212585123 on 7/31/17.
 */
public class StudentAutoWireByType {


    private String name;
    private int age;
    private School schoolAutoWireByType;
    private Address addressAutoWireByType;


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


    public School getSchoolAutoWireByType() {
        return schoolAutoWireByType;
    }

    public void setSchoolAutoWireByType(School schoolAutoWireByType) {
        this.schoolAutoWireByType = schoolAutoWireByType;
    }

    public Address getAddressAutoWireByType() {
        return addressAutoWireByType;
    }

    public void setAddressAutoWireByType(Address addressAutoWireByType) {
        this.addressAutoWireByType = addressAutoWireByType;
    }


    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.getAddressAutoWireByType().toString() + " " + this.getSchoolAutoWireByType().toString();
    }


}
