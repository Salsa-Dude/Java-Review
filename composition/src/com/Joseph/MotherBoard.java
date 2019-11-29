package com.Joseph;

public class MotherBoard {
    private String model;
    private String manufactuer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufactuer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufactuer = manufactuer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading......");
    }

    public String getModel() {
        return model;
    }

    public String getManufactuer() {
        return manufactuer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
