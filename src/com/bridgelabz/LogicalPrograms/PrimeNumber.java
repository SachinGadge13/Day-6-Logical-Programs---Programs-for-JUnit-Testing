package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean primeNumber(int num) {
		// Checking condition 
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a prime Number");
				return false;
			}
		}
		System.out.println(num + " is a prime Number");
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = scanner.nextInt();
		primeNumber(num);
	}
}