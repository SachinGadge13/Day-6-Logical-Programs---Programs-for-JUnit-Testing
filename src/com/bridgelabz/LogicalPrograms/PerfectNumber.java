package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	static double i, sum = 0;

	public static double checkNumber(double number) {
		double num = number;
		for (i = 1; i <= number / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number to check if it is perfect number or not: ");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		sum = checkNumber(number);
		if (sum == number)
			System.out.println(number + " is a perfect number");
		else
			System.out.println(number + " is a not perfect number");

	}

}