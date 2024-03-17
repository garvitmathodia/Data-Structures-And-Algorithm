package com.dsa.math;

public class OddInDuplicate {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 1, 2, 3, 4, 1, 6 };
		System.out.println(findOddOneOut(arr));
	}

	static int findOddOneOut(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}

}
