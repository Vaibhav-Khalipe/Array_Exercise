package com.prowings.basics.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] res = reverseArray(a);
		System.out.println("Reversed Array is :"+Arrays.toString(res));
	}

	public static int[] reverseArray(int[] a) {

		int count = 0;
		int[] b = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			b[count] = a[i];
			count++;

		}

		return b;
	}
}
