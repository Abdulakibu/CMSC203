/*

 * Class: CMSC203 

 * Program:Lab 9

 *  Instructor: Dr. Grinberg

 * Description: Checking account that extends the bank account working with super and sub classes

 * Due: 03/26/2020 

 * I pledge that I have completed the programming assignment independently.

   I have not copied the code from a student or any source.

   I have not given my code to any student.

   Print your Name here: Abdul Akibu

*/
public class CheckingAccount extends BankAccount{
	private static final double FEE = .15; 
	
	public CheckingAccount(String name, double initialAmount) {
		super(name, initialAmount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	public boolean withdraw(double amount) {
		amount += FEE;
		return super.withdraw(amount);
	}
}
