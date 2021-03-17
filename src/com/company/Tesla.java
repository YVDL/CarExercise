package com.company;

public class Tesla extends Car {

    public Tesla(String brand, String modelName, int horsepower, double weightInTons, boolean isElectric) {
        super(brand, modelName, horsepower, weightInTons, isElectric);
        this.getBrand();
        this.getModelName();
        this.getHorsepower();
        this.getWeightInTons();
        this.isElectric();
    }

}
