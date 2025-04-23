package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
        super("HybridCar", "Runs on petrol and electric");
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Hybrid engine starting, cylinders: " + cylinders + ", battery: " + batterySize);
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Driving hybrid, avg km/L: " + avgKmPerLitre);
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": Hybrid engine running...");
    }
}
