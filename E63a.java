/**E63a.java

This class prints all the uppercase letters in an input string 

Lily Sam **/


import java.util.Scanner;

public class E63a {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or sentence here:");
        
        String newWord = scan.nextLine();
        
        
        for (int i = 0; i < newWord.length(); i++) {
            
            if (Character.isUpperCase(newWord.charAt(i))){
                System.out.println(newWord.charAt(i));
            }
           
        }
    }
}