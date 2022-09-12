package com.bridgelabz.LogicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void series() {
		System.out.println("Enter the number till you want to print the Fibonacci series: ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int n1 = 0, n2 = 1, n3, i;
		System.out.print(n1 + "  " + n2);
		for (i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.print("  " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		System.out.println("Print Fibonacci Series: \n");
		series();
	}

}