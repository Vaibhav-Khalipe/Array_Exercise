package com.prowings.basics.array;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		
		int[]a= {1,2,3,4,5,6,7,8,9,10};
		sumOfElementsOfArray(a);
	}

	public static void sumOfElementsOfArray(int[] a) {
		int sum=0;
		for(int x:a)
		{
			sum+=x;
		}
		System.out.println("sum of all array elements is :"+sum);
	}
}
