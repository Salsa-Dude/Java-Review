package com.Joseph;


// encapsulation - by not allowing people to access the field directly, Using a method we can make sure
//            that the data within our object are more valid

public class Car {

    private int doors;
    private int wheels;
    // public - will have access outside the class
    // public String model;
    private String model;
    private String engine;
    private String color;

    // setter method
    // - allows us to validate
    public void setModel(String model) {
        // validation
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")|| validModel.equals("ferrari")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    // getters method
    public String getModel() {
        return this.model;
    }

}
