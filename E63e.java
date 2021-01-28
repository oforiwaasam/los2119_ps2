/**E63e.java

This class prints the position of all vowels in an input string 

Lily Sam **/


import java.util.Scanner;

public class E63e {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or sentence here:");
        
        String sentence = scan.nextLine();
        
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a'||ch == 'e'||ch == 'o'||ch == 'i'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') {
                
               System.out.println("The vowel " + ch + " is at position " + i + "\n");
            }
        }
        
    }
}