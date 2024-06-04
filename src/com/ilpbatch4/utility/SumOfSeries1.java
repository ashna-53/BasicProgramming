package com.ilpbatch4.utility;

public class SumOfSeries1 {

	public static void main(String[] args) {
		int input = 3;
		sumOfSeries(input);
    }   

	private static void sumOfSeries(int input) {
		int sum =0;
	    for(int i=0;i<input;i++) {
			int num = 2*i + 1;
			if(i%2==0) {
				sum = sum + num;
			}else {
				sum = sum - num;
			}
		}
		System.out.println(sum);
		
	}

}
