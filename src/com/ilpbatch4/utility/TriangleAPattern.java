package com.ilpbatch4.utility;

public class TriangleAPattern {
	public static void main(String[] args) {
		int input = 4;
		triangleAPattern(input);
	}
    private static void triangleAPattern(int input) {
		int spaces = input - 1;
		int columns = 1;
		for (int i = 1; i <= input; i++) {
			char ch = 'A';
			int num = 1;
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= columns; j++) {
				System.out.print(ch);
				ch = (char) (ch + 1);
			}
			for (int j = 1; j <= columns; j++) {
				System.out.print(num);
				num++;
			}
			columns = columns + 1;
			spaces--;
			System.out.println("");
		}
	}
}
