package app;

public class FuelTank extends CarPart{

    private int fuelLevel;

    // default constructor
    public FuelTank() {
        super("fuel tank");
    }

    // overloaded constructor
    public FuelTank(int fuelLevel){
        super("fuel tank");
        this.fuelLevel = fuelLevel;
    }

    // each subclass should implement inherited function()
    public void function(){
        
        switch (this.fuelLevel) {
            case 0:
                System.out.println("Fuel tank is empty");
                condition -= 10;
                break;
            
            case 1:
                System.out.println("Fuel tank is half-full");
                condition -= 5;
                break;

            case 2:
                System.out.println("Fuel tank is full");
                break;
            default:
                break;
        }
    }
}