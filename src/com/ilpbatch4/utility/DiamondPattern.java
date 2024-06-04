package com.ilpbatch4.utility;

public class DiamondPattern {
	public static void main(String[] args) {
		int input = 5;
		diamondPattern(input);
    }
    private static void diamondPattern(int input) {
		int mid = input / 2;
		int number = 1;
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= mid; j++)
				System.out.print(" ");
			int count = number / 2 + 1;
			for (int k = 1; k <= number; k++) {
				System.out.print(count);
				if (k <= number / 2)
					count--;
				else
					count++;
			}
			System.out.println();
			if (i <= input / 2) {
				mid = mid - 1;
				number = number + 2;
			} else {
				mid = mid + 1;
				number = number - 2;
			}
		}
	}
}
