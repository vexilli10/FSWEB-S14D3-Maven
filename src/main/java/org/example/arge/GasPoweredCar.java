package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        super("GasPoweredCar", "Runs on petrol");
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Petrol engine starting with " + cylinders + " cylinders.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Driving on petrol, avg km/L: " + avgKmPerLitre);
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": Petrol engine running...");
    }
}
