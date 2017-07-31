package model;

/**
 * Created by a212585123 on 7/31/17.
 */
public class StudentAutoWireByAutoDetect {


    private String name;
    private int age;
    private School schoolAutoWireByAutoDetect;
    private Address addressAutoWireByAutoDetect;


    StudentAutoWireByAutoDetect() {

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


    public School getSchoolAutoWireByAutoDetect() {
        return schoolAutoWireByAutoDetect;
    }

    public void setSchoolAutoWireByAutoDetect(School schoolAutoWireByAutoDetect) {
        this.schoolAutoWireByAutoDetect = schoolAutoWireByAutoDetect;
    }

    public Address getAddressAutoWireByAutoDetect() {
        return addressAutoWireByAutoDetect;
    }

    public void setAddressAutoWireByAutoDetect(Address addressAutoWireByAutoDetect) {
        this.addressAutoWireByAutoDetect = addressAutoWireByAutoDetect;
    }


    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.getAddressAutoWireByAutoDetect().toString() + " " + this.getSchoolAutoWireByAutoDetect().toString();
    }


}
