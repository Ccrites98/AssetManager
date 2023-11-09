package com.pluralsight;
public class Cash extends Asset {
    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }
    @Override
    public double getValue() {
        // Since the value of cash doesn't fluctuate, we can simply return the original cost
        return getOriginalCost();
    }}