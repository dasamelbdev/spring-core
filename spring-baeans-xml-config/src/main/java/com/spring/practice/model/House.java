package com.spring.practice.model;

/**
 * Created by dasun on 3/26/17.
 */
public class House {

    private String houseType;
    private String city;
    private String villege;
    private String road;
    private String houseNumber;


    public House(String city, String villege) {
        this.city = city;
        this.villege = villege;
    }


    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVillege() {
        return villege;
    }

    public void setVillege(String villege) {
        this.villege = villege;
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
        return this.city + " " + this.villege + " " + this.houseNumber + " " + this.road + "  " + this.houseType;
    }
}
