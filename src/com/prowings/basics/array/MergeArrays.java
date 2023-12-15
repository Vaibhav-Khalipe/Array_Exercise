package com.prowings.basics.array;

import java.util.Arrays;

public class MergeArrays {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10 };
		int[] res = mergeArrays(a, b);
		System.out.println(Arrays.toString(res));
	}

	public static int[] mergeArrays(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}

		return c;
	}
}