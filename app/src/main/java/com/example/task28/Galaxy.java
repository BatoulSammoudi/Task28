package com.example.task28;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {
        this.getBatteryPercentage();
        this.getCarrier();
        this.getVersionNumber();
    }

    @Override
    public String ring() {
        return this.getRingTone();
    }

    @Override
    public String unlock() {
        return this.getCarrier();
    }
}
