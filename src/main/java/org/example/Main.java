package org.example;


import org.example.company.*;
import org.example.arge.*;

public class Main {
    public static void main(String[] args) {
        // Pacific Car Company tests
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        // Car R&D Company tests
        System.out.println("\n--- Car R&D Company Testing ---");
        CarSkeleton skeleton = new CarSkeleton();
        skeleton.startEngine();
        skeleton.drive();

        CarSkeleton gas = new GasPoweredCar(15.5, 4);
        gas.startEngine();
        gas.drive();

        CarSkeleton electric = new ElectricCar(100, 75);
        electric.startEngine();
        electric.drive();

        CarSkeleton hybrid = new HybridCar(20, 80, 4);
        hybrid.startEngine();
        hybrid.drive();
    }
}