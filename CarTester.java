/**CarTester.java

This tester class has the main method which adds a particular amount of fuel and reduces the amount of fuel
when the car is driven

Lily Sam **/


public class CarTester {
    
    public static void main(String[] args) {
        
       Car myCar = new Car(80.0);
       myCar.addGas(30.0);
       myCar.drive(800.0);
       double gasLeft = myCar.getGasInTank();
        
        System.out.println("Expected: You have 20.0 gallons of fuel left");
        System.out.println("Actual: You have " + gasLeft + " gallons of fuel left");
    }
}