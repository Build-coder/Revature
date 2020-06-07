package app;

// every class representing a car part should
// inherit from a superclass called "CarPart"
public class Engine extends CarPart{

    private boolean on;
    private int cylinders;

    // default constructor
    public Engine(){
        super("engine");
    }

    // overload constructor
    public Engine(boolean on, int cylinders){
        super("engine");
        this.on = on;
        this.cylinders = cylinders;
    }

    // each subclass should implement inherited function()
    public void function(){
        if (this.on) {
            System.out.println("Engine is on");
        } else{
            System.out.println("Engine is off");
        }

        switch (this.cylinders) {
            case 2: 
                System.out.println("Engine has two cylinders");
                condition -= 5;
                break;

            case 4: 
                System.out.println("Engine has four cylinders");
                condition -= 10;
                break;

            case 6: 
                System.out.println("Engine has six cylinders");
                condition -= 15;
                break;

            case 8: 
                System.out.println("Engine has eight cylinders");
                condition -= 20;
                break;

            default:
                System.out.println("Engine does not have 2-8 cylinders");
                break;
        }
    }
}