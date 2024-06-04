package com.ilpbatch4.utility;

public class SumOfSeries2 {

	public static void main(String[] args) {
		int input=4;
		sumOfCube(input);
    }
    private static void sumOfCube(int input) {
		int sum=0;
		int cube;
		int n1=0;
		int n2=1;
		int n3;
		for(int i=1;i<=input;i++) {
			n3=n1+n2;
			cube = n3*n3*n3;
			sum = sum + cube;
			n1=n2;
			n2=n3;
		}
		System.out.println(sum);
	}
}
