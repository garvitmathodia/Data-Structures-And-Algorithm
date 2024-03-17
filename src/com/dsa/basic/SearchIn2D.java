package com.dsa.basic;

import java.util.Arrays;

public class SearchIn2D {
	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 54, 65 }, { 32, 44, 5 }, { 33, 443, 5443, 123 }, { 12, 343432 } };
		int target = 443;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));

		System.out.println(max(arr));
	}

	static int[] search(int[][] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == target) {
					return new int[] { i, j };
				}
			}

		}
		return new int[] { -1, -1 };
	}

	static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}

		}
		return max;
	}
}
