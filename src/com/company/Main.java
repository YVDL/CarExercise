package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("***************************************");
            System.out.println("** WELCOME TO THE YEARLY CAR AUCTION **");
            System.out.println("***************************************");



        Tesla tesla = new Tesla("Tesla", "Model S", 750, 2.3, true);
        System.out.println(" ");
        System.out.println("This car is a " + tesla.getBrand() + " " + tesla.getModelName());
        System.out.println("It has " + tesla.getHorsepower() + " HP");
        System.out.println("The car weighs " + tesla.getWeightInTons() + " tons");
        System.out.println("Is this car electric? " + tesla.isElectric());

        Porsche porsche = new Porsche("Porsche", "911 4S", 420, 1.8, false);
        System.out.println(" ");
        System.out.println("This car is a " + porsche.getBrand() + " " + porsche.getModelName());
        System.out.println("It has " + porsche.getHorsepower() + " HP");
        System.out.println("The car weighs " + porsche.getWeightInTons() + " tons");
        System.out.println("Is this an electric car? " + porsche.isElectric());

        Bentley bentley = new Bentley("Bentley", "Mulsanne", 560, 2.9, false);
        System.out.println(" ");
        System.out.println("This car is a " + bentley.getBrand() + " " + tesla.getModelName());
        System.out.println("It has " + bentley.getHorsepower() + " HP");
        System.out.println("The car weighs " + bentley.getWeightInTons() + " tons");
        System.out.println("Is this car electric? " + bentley.isElectric());
    }
}
