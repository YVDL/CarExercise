package com.company;

public class Bentley extends Car{
    public Bentley (String brand, String modelName, int horsepower, double weightInTons, boolean isElectric) {
        super(brand, modelName, horsepower, weightInTons, isElectric);
        this.getBrand();
        this.getModelName();
        this.getHorsepower();
        this.getWeightInTons();
        this.isElectric();
    }
}
