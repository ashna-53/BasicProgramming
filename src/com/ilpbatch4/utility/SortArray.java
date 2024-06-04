package com.ilpbatch4.utility;

public class SortArray {
	public static void main(String[] args) {
		int[] number = { 2, 0, 2, 1, 1, 0 };
		sortArray(number);
		System.out.println("Sorted array:");
		for (int num : number) {
			System.out.print(num + " ");
		}
	}

	private static void sortArray(int[] number) {
		int low = 0;
		int high = number.length - 1;
		int mid = 0;
        while (mid <= high) {
			switch (number[mid]) {
			case 0:
				swap(number, low, mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(number, mid, high);
				high--;
				break;
			}
		}

	}
    private static void swap(int[] number, int low, int mid) {
		int temp = number[low];
		number[low] = number[mid];
		number[mid] = temp;

	}

}
