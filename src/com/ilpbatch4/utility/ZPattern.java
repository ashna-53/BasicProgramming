package com.ilpbatch4.utility;

public class ZPattern {
	public static void main(String[] args) {
		int input = 4;
		zPattern(input);
	}
    private static void zPattern(int input) {
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (i == 0 || i == input - 1 || j == input - 1 - i) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
