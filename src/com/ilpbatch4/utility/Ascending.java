package com.ilpbatch4.utility;

public class Ascending {

	public static void main(String[] args) {
		int array[]= {9,2,8,1};
		ascending(array);
	}
    private static void ascending(int[] array) {
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
