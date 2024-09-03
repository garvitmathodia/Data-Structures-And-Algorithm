package com.dsa.revision;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = { 13, 46, 24, 52, 20, 9 };
		int[] arr1 = { 9, 13, 20, 24, 46, 52 };
		int[] arr2 = { 52, 46, 24, 20, 13, 9 };
		selectionSort(arr);
//		insertionSort(arr);
//		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {
		boolean ans;
		for (int i = 0; i < arr.length; i++) {
				ans = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
					ans = true;
				}
			}
			if (ans == false) {
				break;
			}
		}
	}

	public static void selectionSort(int[] arr) {
		for(int i = 0 ; i<arr.length ; i++) {
			int maxInd = getMaxIndex(arr, 0, arr.length-1-i);
			swap(arr, arr.length-1-i, maxInd);
		}
	}
	
	public static void insertionSort(int[] arr) {
		for(int i = 1 ; i<arr.length ; i++) {
			for(int j = i ; j>0 ; j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr, j, j-1);
				}else {
					break;
				}
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int getMaxIndex(int[] arr, int start, int end) {
		int max = start;
		for (int i = start + 1; i <= end; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}
}
