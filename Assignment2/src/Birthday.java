import javax.swing.*;
import java.util.Random;
import java.text.DecimalFormat;

public class Birthday {

	public static void main(String[] args) {
		Toy toy;
		String name, toyChoice, answer, balloon, card, ageOk, anotherGift, addOns=" ";
		int age;
		boolean ageAppropriateLoop = false, anotherGiftLoop = false;
		double cost;
		double totalCost = 0;
		DecimalFormat twoPlaces = new DecimalFormat("0.00");
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children");
		System.out.println("Birthday Gifts");
		do {
			do {
				name = JOptionPane.showInputDialog("Enter the name of the Child");
				age = Integer.parseInt(JOptionPane.showInputDialog("How old is the child?"));
				toyChoice = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
				while (!toyChoice.equalsIgnoreCase("plushie") && !toyChoice.equalsIgnoreCase("blocks")
						&& !toyChoice.equalsIgnoreCase("book")) {
					toyChoice = JOptionPane
							.showInputDialog("Please choose a toy. It has to be either a plushie, blocks, or a book");
				}
				toy = new Toy(toyChoice, age);
				ageOk = toy.ageOK() ? "sutable" : "not sutable";
				answer = JOptionPane
						.showInputDialog("The toy is " + ageOk + " for the child. Do you wish cancel? 'Yes' or 'No'");
				while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
					answer = JOptionPane.showInputDialog("Please enter only 'Yes' or 'No'");
				}
				ageAppropriateLoop = answer.equalsIgnoreCase("yes");
			} while (ageAppropriateLoop);
			balloon = JOptionPane.showInputDialog("Would you like to add a balloon?'Yes' or 'No'");
			while (!balloon.equalsIgnoreCase("yes") && !balloon.equalsIgnoreCase("no")) {
				balloon = JOptionPane.showInputDialog("Please enter only 'Yes' or 'No'");
			}
			if (balloon.equalsIgnoreCase("yes")) {
				toy.addBalloon(balloon);
				addOns = "and a balloon ";
			}
			card = JOptionPane.showInputDialog("Would you like to add a card?'Yes' or 'No'");
			while (!card.equalsIgnoreCase("yes") && !card.equalsIgnoreCase("no")) {
				card = JOptionPane.showInputDialog("Please enter only 'Yes' or 'No'");
			}
			if (card.equalsIgnoreCase("yes")) {
				toy.addCard(card);
				addOns += "and a card ";
			}
			cost = toy.getCost();
			System.out.println("The gift for " +name+ " " +age + " years old is a "+toyChoice+" "+addOns+"which costs $"+twoPlaces.format(cost));
			totalCost += cost;
			anotherGift = JOptionPane.showInputDialog("Would you like to add a gift?'Yes' or 'No'");
			while (!anotherGift.equalsIgnoreCase("yes") && !anotherGift.equalsIgnoreCase("no")) {
				anotherGift = JOptionPane.showInputDialog("Please enter only 'Yes' or 'No'");
			}
			anotherGiftLoop = anotherGift.equalsIgnoreCase("yes");
		} while (anotherGiftLoop);
		
		Random rand = new Random();
		System.out.println("The totol cost is: $" + twoPlaces.format(totalCost) + " And your order number is: "
				+ (10000 + rand.nextInt(100000)));
		System.out.println("Created by Abdul Akibu");
	}
}
