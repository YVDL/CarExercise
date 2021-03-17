package com.company;

public abstract class Car {
    private String brand;
    private String modelName;
    private int horsepower;
    private boolean isElectric;
    private double weightInTons;

    protected Car(){
    }

    public Car(String brand, String modelName, int horsepower, double weightInTons, boolean isElectric) {
        this.brand = brand;
        this.modelName = modelName;
        this.horsepower = horsepower;
        this.weightInTons = weightInTons;
        this.isElectric = isElectric;
    }

    public String getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String isElectric() {
        if (isElectric) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public double getWeightInTons() {
        return weightInTons;
    }
}
