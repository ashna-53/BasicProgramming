package com.ilpbatch4.utility;

public class MissingNumbers {
	public static void main(String[] args) {
		int array[] = { 1, 3, 4, 5, 6, 9, 10 ,-6};
		int limit = 10;
		missingNumbers(array, limit);
	}
    private static void missingNumbers(int[] array, int limit) {
		for (int i = -10; i <= limit; i++) {
			int temp = 0;
			for (int j = 0; j < array.length; j++) {
				
				if (array[j] == i) {
					temp = 1;
				}
				
			}
			if (temp == 0) {
				if(i%2!=0) {
					System.out.println(i);	
				}
				
			}
		}
	}
}
