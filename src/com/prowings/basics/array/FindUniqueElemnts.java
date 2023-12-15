package com.prowings.basics.array;

import java.util.Arrays;

public class FindUniqueElemnts {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4,  2, 6 };
		int[] res = uniqueElemnts(a);
		System.out.println("Unique Element Array is :"+Arrays.toString(res));
	}

	public static int[] uniqueElemnts(int[] a) {
		int count = 0;
		int[] array = new int[a.length];
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != a[j]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if(flag)
			{
				array[count++]=a[i];
			}
		}
		int[]uniqueElements= new int[count];
		for(int i=0;i<count;i++)
		{
			uniqueElements[i]=a[i];
		}
		return uniqueElements;
	}

}
