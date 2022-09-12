package com.bridgelabz.ProgramsForJUnitTesting;

import java.util.Scanner;

public class Binary {

	static void toBinary(int n) {
		if (n == 0) {
			return;
		}
		int remainder = n % 2;
		n = n / 2;
		toBinary(n);
		System.out.printf("%d", remainder);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scan.nextInt();
		toBinary(a);
	}
}