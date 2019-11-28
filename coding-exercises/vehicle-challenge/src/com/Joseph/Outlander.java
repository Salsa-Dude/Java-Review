package com.Joseph;

public class Outlander extends Car {
    private int roadServiceMonths;


    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
