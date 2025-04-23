package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(double avgKmPerCharge, int batterySize) {
        super("ElectricCar", "Runs on electric battery");
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Electric motor starting silently.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Driving on battery, avg km/charge: " + avgKmPerCharge);
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": Electric motor running...");
    }
}