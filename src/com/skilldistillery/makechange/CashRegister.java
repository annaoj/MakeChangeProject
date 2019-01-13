package com.skilldistillery.makechange;

public class CashRegister {
	public double itemPrice, customerMoney, change;
	public int resTwenties, resTens, resFives, resDollars, resTwentyFiveCents, resTenCents, resFiveCents, resPenny;

	public void printError() {
		System.out.println("Oops, Error! it's not enough");
	}

	public void printNoChangeMessage() {
		System.out.println("Thank you for your purchase.No change!GoodBye!");
	}

	public void calculateChange() {

		change = customerMoney - itemPrice;

		double twenties = change / 20;
		resTwenties = (int) Math.floor(twenties);

		double tens = (change % 20) / 10;
		resTens = (int) Math.floor(tens);

		double fives = (change % 20 % 10) / 5;
		resFives = (int) Math.floor(fives);

		double dollars = (change % 20 % 10 % 5);
		resDollars = (int) Math.floor(dollars);

		double twentyFiveCents = (change % 20 % 10 % 5 % 1) / 0.25;
		resTwentyFiveCents = (int) Math.floor(twentyFiveCents);

		double tenCents = (change % 20 % 10 % 5 % 1 % 0.25) / 0.1;
		resTenCents = (int) Math.floor(tenCents);

		double fiveCents = (change % 20 % 10 % 5 % 1 % 0.25 % 0.1) / 0.05;
		resFiveCents = (int) Math.floor(fiveCents);

		double penny = (change % 20 % 10 % 5 % 1 % 0.25 % 0.1 % 0.05) / 0.01;
		resPenny = (int) Math.round(penny);

		printResults();

	}

	public void printResults() {
		System.out.print("Amount: " + itemPrice + ", Tendered: " + customerMoney);
		System.out.println(", Result:  ");
		if (resTwenties != 0) {
			System.out.println(resTwenties + " twenty dollar bill, ");
		}
		if (resTens != 0) {
			System.out.println(resTens + " ten dollar bill, ");

		}
		if (resFives != 0) {
			System.out.println(resFives + " five dollar bill, ");

		}
		if (resDollars != 0) {
			System.out.println(resDollars + " one dollar bill, ");

		}
		if (resTwentyFiveCents != 0) {
			if (resTenCents > 1) {
				System.out.println(resTwentyFiveCents + " quarters, ");
			} else {
				System.out.println(resTwentyFiveCents + " quarter, ");
			}

		}
		if (resTenCents != 0) {
			if (resTenCents > 1) {
				System.out.println(resTenCents + " dimes, ");
			} else {
				System.out.println(resTenCents + " dime, ");
			}

		}
		if (resFiveCents != 0) {
			System.out.println(resFiveCents + " nickel, ");

		}
		if (resPenny != 0) {
			if (resPenny > 1) {
				System.out.println(resPenny + " pennies.");
			} else {
				System.out.println(resPenny + " penny.");
			}

		}

	}

}
