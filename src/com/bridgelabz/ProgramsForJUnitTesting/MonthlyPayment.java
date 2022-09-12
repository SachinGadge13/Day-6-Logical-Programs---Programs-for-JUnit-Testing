package com.bridgelabz.ProgramsForJUnitTesting;

import java.util.Scanner;

public class MonthlyPayment {

	static void payment(double P, double r, double n) {
		// Calculating Month Payment using given formula
		double result = P * r / (1 - Math.pow((1 + r), -n));
		System.out.println("The monthly payment will be : " + result);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principal : ");
		double P = scan.nextInt();
		System.out.println("Enter the year : ");
		double Y = scan.nextInt();
		System.out.println("Enter the rate of interest : ");
		double R = scan.nextInt();
		double n = 12 * Y;
		double r = R / (12 * 100);
		payment(P, r, n);
	}
}