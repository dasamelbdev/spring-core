package model;

/**
 * Created by a212585123 on 7/31/17.
 */
public class StudentAutoWireBhName {

    private String name;
    private int age;
    private School schoolAutoWireByName;
    private Address addressAutoWireByName;


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


    public School getSchoolAutoWireByName() {
        return schoolAutoWireByName;
    }

    public void setSchoolAutoWireByName(School schoolAutoWireByName) {
        this.schoolAutoWireByName = schoolAutoWireByName;
    }

    public Address getAddressAutoWireByName() {
        return addressAutoWireByName;
    }

    public void setAddressAutoWireByName(Address addressAutoWireByName) {
        this.addressAutoWireByName = addressAutoWireByName;
    }


    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.getAddressAutoWireByName().toString() + " " + this.getSchoolAutoWireByName().toString();
    }


}
