/**Car.java

This Car class supplies methods for adding fuel, checking the amount of fuel left and reducing the amount
of fuel in the tank

Lily Sam **/



public class Car {
    
    //instance variables
    private double fuel;
    private double efficiency;
    
    public Car (double e) {
        efficiency = e;
        fuel=0.0;
        
    }
    
    public void drive(double miles) {
        fuel = fuel - miles/efficiency;
        
    }
    
    public void addGas(double amt) {
        fuel = fuel + amt;
    }
    
    public double getGasInTank() {
        return fuel;
    }
}