package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
        this.name = "Unknown";
        this.description = "No description";
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine() {
        System.out.println("CarSkeleton: engine starting...");
    }

    public void drive() {
        System.out.println("CarSkeleton: driving...");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("CarSkeleton: engine running...");
    }
}
