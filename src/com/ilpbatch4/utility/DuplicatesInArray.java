package com.ilpbatch4.utility;

public class DuplicatesInArray {
   public static void main(String[] args) {
		int array[]= {2,3,2,5,1,1};
		System.out.println("Duplicate elements in given array: ");
		duplicatesInArray(array);
    }
    private static void duplicatesInArray(int[] array) {
    	for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j])
					System.out.println(array[j]);
			}
		}
	}
}
