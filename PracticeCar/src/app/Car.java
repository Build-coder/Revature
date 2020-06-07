package app;

import java.util.Scanner;
import java.util.ArrayList;

public class Car {

    // create scanner object for user input
    Scanner System_in = new Scanner(System.in);

    // collection of CarPart reference variables
    private ArrayList<CarPart> parts = new ArrayList<>();

    // Car class creates an instance of each CarPart subclass
    // as part of its constructor. 
    public Car(){

        // engine attributes
        final boolean engineRunning;
        final int numCylinders;
        
        // fuel tank attributes
        final int fuelLevel;

        // tire attributes
        final int tirePressure;
        final int tireTreading;

        // gather user input for ENGINE
        System.out.print("Is the engine running? ");
        String response = System_in.nextLine();

        if (response.toLowerCase() == "yes" || response == "y") {
            engineRunning = true;
        } else {
            engineRunning = false;
        }

        System.out.println("How many cylinders does the car have?");
        System.out.print("Enter 2, 4, 6, or 8: ");
        // convert String to int and save value as numCylinders
        numCylinders = Integer.parseInt(System_in.nextLine());


        // gather user input for FUELTANK
        System.out.println("If the fuel tank is empty, enter: 0");
        System.out.println("If the fuel tank is half-full, enter: 1");
        System.out.println("If the fuel tank is full, enter: 2");
        // convert String to int and save value as fuelLevel
        fuelLevel = Integer.parseInt(System_in.nextLine());


        // gather user input for TIRES
        System.out.println("If the tires are flat, enter: 0");
        System.out.println("If the tires are somewhat flat, enter: 1");
        System.out.println("If the tires are full of air, enter: 2");
        // convert String to int and save value as tirePressure
        tirePressure = Integer.parseInt(System_in.nextLine());

        System.out.println("If the tires have no treading, enter: 0");
        System.out.println("If the tires have some treading, enter: 1");
        System.out.println("If the tires have good treading, enter: 2");
        // convert String to int and save value as tireTreading
        tireTreading = Integer.parseInt(System_in.nextLine());

        // instances should be added to a collection of CarPart references
        this.parts.add(new Engine(engineRunning, numCylinders));
        this.parts.add(new FuelTank(fuelLevel));
        this.parts.add(new Tires(tirePressure, tireTreading));
    }

    /**
     * 1. Create a Car class with a run method
     * 
     * 2. The run() method should iterate through 
     *    Car's collection of CarPart references
     * 
     * 3. The references should store the instances
     *    of the CarPart subclasses
     * 
     * 4. On each iteration, the function() method
     *    of the current object in the collection 
     *    should be invoked
     */
    public void run(){

        System.out.println("\nCar is being created...\n");

        for (int p = 0; p < parts.size(); p++) {
            parts.get(p).function();
            parts.get(p).status();
            System.out.println();
        }

    }

}