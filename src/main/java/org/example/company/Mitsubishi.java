package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Japanese engine is roaring!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": Outlander is accelerating!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": Outlander is braking!";
    }
}