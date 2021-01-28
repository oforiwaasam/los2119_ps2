/**Circuit.java

This Circuit class models a Circuit

Lily Sam **/
public class Circuit {
    
    //instance variables
    private int firstSwitch;
    private int secondSwitch;
    private int lampState;
    
    //constructor to initialize instance variables
    public Circuit() {
        
        firstSwitch = 0;
        secondSwitch = 0;
        lampState = 0; 
    }
    
    //Functions
    public int getFirstSwitchState() {
        return firstSwitch;
    }
     
    public int getSecondSwitchState() {
        return secondSwitch;
    }
    
    public int getLampState () {
        return lampState;
    }
    
    //Methods
    public void toggleFirstSwitch() {
        if (firstSwitch==0) {
            firstSwitch=1;
        }
        else {
            firstSwitch=0;
        }
        
       if (lampState==0) {
           lampState=1;
       } 
       else {
           lampState=0;
       }
        
    }
    
    public void toggleSecondSwitch() {
        if (secondSwitch==0) {
            secondSwitch=1;
        }
        else {
            secondSwitch=0;
        }
        
        if (lampState==0) {
            lampState=1;
        }
        else {
            lampState=0;
        }
    }
}