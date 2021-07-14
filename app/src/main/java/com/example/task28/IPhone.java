package com.example.task28;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {
          this.toString() ;
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
