package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel,
                   int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    } //get/set
    public String getMakeModel() {
        return makeModel;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getOdometer() {
        return odometer;
    }
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue() {
        double value = originalCost;
        int age = 2023 - year;
        if (age <= 3) {
            value *= (1 - age * 0.03);
        } else if (age <= 6) {
            value *= (1 - age * 0.06);
        } else if (age <= 10) {
            value *= (1 - age * 0.08);
        } else {
            value = 1000.00;
        }
        if (odometer > 100000 && !makeModel.toLowerCase().contains("toyota") && !makeModel.toLowerCase().contains("honda")) {
            value *= 0.75;
        }
        return value;
    }}

