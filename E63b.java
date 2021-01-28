/**E63b.java

This class prints every second letter of an input string 

Lily Sam **/


import java.util.Scanner;

public class E63b {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something here:");
        
        String newWord = scan.nextLine();
        
        
        for (int i = 0; i < newWord.length(); i++) {
            
            if (i%2!=0) {
                System.out.println(newWord.charAt(i));
            }
        }
        
    }
    
}