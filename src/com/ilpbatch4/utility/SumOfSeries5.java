package com.ilpbatch4.utility;

public class SumOfSeries5 {
   public static void main(String[] args) {
		int input = 3;
		sumOfSeries(input);
    }
    private static void sumOfSeries(int input) {
		int sum = 0;
		for (int i = 1; i <= input; i++) {
            int term = (int) Math.pow(-1, i + 1) * (int) Math.pow(2 * i - 1, i);
            sum += term;
        }
        System.out.println("Sum of the series: " + sum);
	}
}
