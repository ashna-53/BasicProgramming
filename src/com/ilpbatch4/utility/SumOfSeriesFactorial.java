package com.ilpbatch4.utility;

public class SumOfSeriesFactorial {

	public static void main(String[] args) {
		int input=3;
		sumOfFactorial(input);
    }
    private static void sumOfFactorial(int input) {
		float sum = 0;
		for (int i = 1; i <= input; i++) {
           sum = sum + (float) i / (float) (factorialOfANumber(i));
		}
		System.out.println("Sum of factorial is :" + sum);
	}
	private static int factorialOfANumber(int input) {
		int factorial = 1;
		for (int i = 1; i <= input; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
