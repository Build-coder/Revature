package app;

// every class representing a car part should inherit from
// a superclass called "CarPart." 
public class CarPart implements Functional{ // implement a Functional interface

    // represents the durability of part. starts at 100
    protected int condition = 100;
    protected String partName = "";

    // constructor
    public CarPart(String name){
        this.partName = name;
    }

    // method that prints condition of part to console
    public void status(){
        System.out.println("The " + this.partName + "'s condition is " + this.condition);
    }

    // the type CarPart must implement the inherited abstract method 
    // Functional.function()
    public void function(){
        System.out.println("Functional.function() is invoked");
    }
}