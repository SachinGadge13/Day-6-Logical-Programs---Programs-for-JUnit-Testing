package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class ReverseAnumber {
	private static void findReverse(int number) {
		int n = number;
		if (n < 10)
			System.out.println(n);
		else {
			System.out.print(n % 10);
			findReverse(n / 10);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number to get the reverse of it: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Reverse of number will be: ");
		findReverse(number);
	}
}