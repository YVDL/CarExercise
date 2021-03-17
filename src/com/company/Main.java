package com.company;

public class Main {

    public static void main(String[] args) {
        Tesla tesla = new Tesla("Tesla", 750, 2.3, true);
        System.out.println("This car is a " + tesla.getBrand());
        System.out.println("It has " + tesla.getHorsepower() + " HP");
        System.out.println("The car weighs " + tesla.getWeightInTons() + " tons");
        System.out.println("Is this car electric? " + tesla.isElectric());
    }
}
