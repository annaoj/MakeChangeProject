package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		CashRegister cr1 = new CashRegister();
		String input;

		do {
			System.out.println("What is the price of the item?");

			double itemPrice = kb.nextDouble();

			System.out.println("How much money was given by customer?");
			double customerMoney = kb.nextDouble();

			if (customerMoney < itemPrice) {
				cr1.printError();
			} else if (customerMoney == itemPrice) {
				cr1.printNoChangeMessage();
			} else {
				cr1.calculateChange(itemPrice, customerMoney);
			}

			System.out.println("Would you like to calculate again?Y for yes or N for exit");
			input = kb.next();

		} while (input.equalsIgnoreCase("Y"));

		System.out.println("Bye!Have a great day!");

		kb.close();

	}

}
