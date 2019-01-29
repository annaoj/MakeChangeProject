package com.skilldistillery.makechange;

public class CashRegister {
	
	public void printError() {
		System.out.println("Oops, Error! it's not enough");
	}

	public void printNoChangeMessage() {
		System.out.println("Thank you for your purchase.No change!GoodBye!");
	}

	public void calculateChange(double itemPrice, double customerMoney) {

		int[] changeAmounts;
		
		double change = customerMoney - itemPrice;

		double twenties = change / 20;
		int resTwenties = (int) Math.floor(twenties);

		double tens = (change % 20) / 10;
		int resTens = (int) Math.floor(tens);

		double fives = (change % 20 % 10) / 5;
		int resFives = (int) Math.floor(fives);

		double dollars = (change % 20 % 10 % 5);
		int resDollars = (int) Math.floor(dollars);

		double twentyFiveCents = (change % 20 % 10 % 5 % 1) / 0.25;
		int resTwentyFiveCents = (int) Math.floor(twentyFiveCents);

		double tenCents = (change % 20 % 10 % 5 % 1 % 0.25) / 0.1;
		int resTenCents = (int) Math.floor(tenCents);

		double fiveCents = (change % 20 % 10 % 5 % 1 % 0.25 % 0.1) / 0.05;
		int resFiveCents = (int) Math.floor(fiveCents);

		double penny = (change % 20 % 10 % 5 % 1 % 0.25 % 0.1 % 0.05) / 0.01;
		int resPenny = (int) Math.round(penny);
		
		System.out.print("Amount: " + itemPrice + ", Tendered: " + customerMoney);
		changeAmounts = new int[]{
				resTwenties, resTens, 
				resFives, resDollars, 
				resTwentyFiveCents, resTenCents,
				resFiveCents, resPenny	
		};
		printResults(changeAmounts);

	}

	public void printResults(int[] changeAmounts) {

		System.out.println(", Result:  ");
		if (changeAmounts[0] != 0) {
			System.out.println(changeAmounts[0] + " twenty dollar bill, ");
		}
		if (changeAmounts[1] != 0) {
			System.out.println(changeAmounts[1] + " ten dollar bill, ");

		}
		if (changeAmounts[2] != 0) {
			System.out.println(changeAmounts[2] + " five dollar bill, ");

		}
		if (changeAmounts[3] != 0) {
			System.out.println(changeAmounts[3] + " one dollar bill, ");

		}
		if (changeAmounts[4] != 0) {
			if (changeAmounts[4] > 1) {
				System.out.println(changeAmounts[4] + " quarters, ");
			} else {
				System.out.println(changeAmounts[4] + " quarter, ");
			}

		}
		if (changeAmounts[5] != 0) {
			if (changeAmounts[5] > 1) {
				System.out.println(changeAmounts[5] + " dimes, ");
			} else {
				System.out.println(changeAmounts[5] + " dime, ");
			}

		}
		if (changeAmounts[6] != 0) {
			System.out.println(changeAmounts[6] + " nickel, ");

		}
		if (changeAmounts[7] != 0) {
			if (changeAmounts[7] > 1) {
				System.out.println(changeAmounts[7] + " pennies.");
			} else {
				System.out.println(changeAmounts[7] + " penny.");
			}

		}

	}

}
