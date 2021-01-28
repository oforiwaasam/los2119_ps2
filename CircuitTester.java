/**CircuitTester.java

This tester class has the main method which prints out actual results anytime any switch is toggled

Lily Sam **/


public class CircuitTester {
    
    public static void main(String[] args) {
        
        //calling methods 
        Circuit myCircuit = new Circuit();
        System.out.println("Expected: First switch is 0, second switch is 0, lamp is 0");
        System.out.println("Actual: First switch is " + myCircuit.getFirstSwitchState() + ", "+ " second switch is " 
                           + myCircuit.getSecondSwitchState() + ", "+ " lamp is " + myCircuit.getLampState() + "\n");
        
        myCircuit.toggleFirstSwitch();
        System.out.println("Expected: First switch is 1, second switch is 0, lamp is 1");
        System.out.println("Actual: First switch is " + myCircuit.getFirstSwitchState() + ", " + " second switch is " 
                           + myCircuit.getSecondSwitchState() + ", " + " lamp is " + myCircuit.getLampState() + "\n");
        
        myCircuit.toggleSecondSwitch();
        System.out.println("Expected: First switch is 1, second switch is 1, lamp is 0");
        System.out.println("Actual: First switch is " + myCircuit.getFirstSwitchState() + ", " + " second switch is " 
                           + myCircuit.getSecondSwitchState() + ", " + " lamp is " + myCircuit.getLampState() + "\n");
        
        myCircuit.toggleFirstSwitch();
        System.out.println("Expected: First switch is 0, second switch is 1, lamp is 1");
        System.out.println("Actual: First switch is " + myCircuit.getFirstSwitchState() + ", " + " second switch is " 
                           + myCircuit.getSecondSwitchState() + ", " + " lamp is " + myCircuit.getLampState());
        
    }
}