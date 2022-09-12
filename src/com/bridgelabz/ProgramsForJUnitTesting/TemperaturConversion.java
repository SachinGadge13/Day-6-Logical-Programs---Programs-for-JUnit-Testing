package com.bridgelabz.ProgramsForJUnitTesting;

import java.util.Scanner;

public class TemperaturConversion {

	static void temperatureConversion(double temp, int ch) {
		if (ch == 1) {
			double f = temp * 9 / 5 + 32;
			System.out.println("Temperature in Fahrenheit : " + f + " F");
		}
		if (ch == 2) {
			double c = (temp - 32) * 5 / 9;
			System.out.println("Temperature in Celsius : " + c + " C");
		}
	}

	public static void main(String[] args) {
		// Scanner Object for User Input
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose type of conversion \n 1. Celsius to Fahrenheit  \n 2. Fahrenheit to Celsius");
		int ch = scan.nextInt();
		System.out.println("Enter Temperature :");
		double temp = scan.nextDouble();
		temperatureConversion(temp, ch);
	}
}