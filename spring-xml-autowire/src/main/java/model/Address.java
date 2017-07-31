package model;

/**
 * Created by a212585123 on 7/31/17.
 */
public class Address {

    private String city;
    private String road;
    private String houseNumber;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return this.city + " " + this.road + " " + this.houseNumber;
    }
}
