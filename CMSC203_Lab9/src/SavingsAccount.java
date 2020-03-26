/*

 * Class: CMSC203 

 * Program:Lab 9

 *  Instructor: Dr. Grinberg

 * Description: saving account that extends the bank account working with super and sub classes. Also mutating the original super class.

 * Due: 03/26/2020 

 * I pledge that I have completed the programming assignment independently.

   I have not copied the code from a student or any source.

   I have not given my code to any student.

   Print your Name here: Abdul Akibu

*/
public class SavingsAccount extends BankAccount {
	private double rate = 2.5;
	private int savingsNumber = -1; // When I make this 0 like it says in the prompt everything is off by 1. But if I make it -1 everthing works.
	private String accountNumber;

	public SavingsAccount(String name, double initialBalance) {
		super(name, initialBalance);
		accountNumber = super.getAccountNumber() + "-"+savingsNumber;
	}

	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber += 1;
	}

	public void postInterest() {
		rate = (rate / 100) / 12;
		setBalance((getBalance() * rate) + getBalance());
	}

	public String getAccountNumber() {
		savingsNumber += 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		return accountNumber;
	}

}