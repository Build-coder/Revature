package app;

public class Tires extends CarPart{

    private int wear;
    private int air;

    // default constructor
    public Tires() {
        super("tires");
    }

    // overloaded constructor
    public Tires(int wear, int air){
        super("tires");
        this.wear = wear;
        this.air = air;
    }

    // each subclass should implement inherited function()
    public void function(){
        
        switch (wear) {
            case 0:
                System.out.println("Tires are bald");
                condition -= 10;
                break;
            
            case 1:
                System.out.println("Tires have some wear and tear");
                condition -= 5;

            case 2:
                System.out.println("Tires have good treads");
            default:
                break;
        }

        switch (air) {
            case 0:
                System.out.println("Tires are flat");
                condition -= 10;
                break;

            case 1:
                System.out.println("Tires are somewhat flat");
                condition -= 5;

            case 2:
                System.out.println("Tires are full of air");
            default:
                break;
        }
    }
}