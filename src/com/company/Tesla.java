package com.company;

public class Tesla extends Car {

    public Tesla(String brand, int horsepower, double weightInTons, boolean isElectric) {
        super(brand, horsepower, weightInTons, isElectric);
        this.getBrand();
        this.getHorsepower();
        this.getWeightInTons();
        this.isElectric();
    }

}
