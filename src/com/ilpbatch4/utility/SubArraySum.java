package com.ilpbatch4.utility;

public class SubArraySum {
	public static void main(String[] args) {
		int sum = 33;
		int array[] = { 1, 4, 20, 3, 10, 5 };
		int result[] = subArraySum(array, sum);
		if (result[0] == -1) {
			System.out.println("Subarray is not found");
		} else {
			System.out.println("Subarray found from index " + result[0] + " to " + result[1]);
		}
	}

	private static int[] subArraySum(int[] array, int sum) {
		int leftNumber = 0;
		int rightNumber = 0;
		int currentSum = 0;

		while (rightNumber < array.length) {
			currentSum += array[rightNumber];

			while (currentSum > sum) {
				currentSum -= array[leftNumber];
				leftNumber++;
			}

			if (currentSum == sum) {
				return new int[] { leftNumber, rightNumber };
			}

			rightNumber++;
		}

		return new int[] { -1, -1 };
	}

}
