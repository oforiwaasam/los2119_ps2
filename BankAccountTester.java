/**BankAccountTester.java

This tester class has the main method which deposits and withdraws certain amounts from a particular 
bank account and prints the balance. 

Lily Sam **/



public class BankAccountTester {
    
    public static void main(String[] args) {
        
        BankAccount myBankAccount = new BankAccount("Lily", 1257849);
        myBankAccount.deposit(1000);
        myBankAccount.withdraw(500);
        myBankAccount.withdraw(400);
        
        System.out.println("Expected result: Your new balance is 100.0");
        System.out.println("Actual result: Your new balance is " + myBankAccount.getBalance());
    }
}