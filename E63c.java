/**E63c.java

This class prints the entire string with vowels replaced with an underscore 

Lily Sam **/


import java.util.Scanner;

public class E63c {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or sentence here:");
        
        String newWord = scan.nextLine();
        System.out.println(newWord.replaceAll("[AaEeIiOoUu]", "_"));
        
      
        }    
        
    }  
    
     

