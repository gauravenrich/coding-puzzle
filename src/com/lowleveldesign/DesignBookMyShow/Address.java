package com.lowleveldesign.DesignBookMyShow;

import com.lowleveldesign.DesignBookMyShow.enums.City;

public class Address {
    private City city;
    private String area;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
