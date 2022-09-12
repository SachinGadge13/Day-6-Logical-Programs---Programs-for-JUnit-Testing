package com.bridgelabz.ProgramsForJUnitTesting;

import java.util.Scanner;

public class VendingMachine {

	static int change(int n) {
		int[] list = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		if (n == 0) {
			return 0;
		}
		int multiplier = 0;
		for (int element : list) {
			if (n >= element) {
				multiplier = n / element;
				n = n - multiplier * element;
				for (int i = 0; i < multiplier; i++) {
					System.out.printf("%d ", element);
				}
				break;
			}
		}
		return multiplier + change(n);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount for change :");
		int n = scan.nextInt();

		System.out.println("No of notes : " + change(n));
	}
}