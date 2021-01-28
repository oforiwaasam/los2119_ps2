/**E63d.java

This class prints the number of vowels in an input string

Lily Sam **/


import java.util.Scanner;

public class E63d {
    
    public static void main(String[] args) {
        
        int vowelCount = 0;
        System.out.println("Enter a word or sentence here:");
        Scanner scan = new Scanner(System.in);
        
        String sentence = scan.nextLine();
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a'||ch == 'e'||ch == 'o'||ch == 'i'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') {
                vowelCount++;
            }
        }
        
        System.out.println("The number of vowels is " + vowelCount);
    }
    
}
        