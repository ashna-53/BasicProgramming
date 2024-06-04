package com.ilpbatch4.utility;

public class SumOfPairs {
	public static void main(String[] args) {
		int[] array = { 1, 5, 7, 1 };
		int sum = 6;
		System.out.println("Number of pairs with sum " + sum + ": " + countPairsWithSum(array, sum));
	}
    private static int countPairsWithSum(int[] array, int sum) {
		int count = 0;
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] + array[j] == sum) {
					count++;
				}
			}
		}
		return count;
	}
}
