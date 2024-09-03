package com.dsa.revision;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 13, 46, 24, 52, 20, 9 };
		int[] arr1 = mergeSort(arr);
		System.out.println(Arrays.toString(arr1));
	}
	
	public static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int mid = arr.length/2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return sort(left , right);
	}
	
	public static int[] sort(int[] left , int[] right) {
		int l = left.length;
		int r = right.length;
		int[] arr = new int[l+r];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<l && j<r) {
			if(left[i]<=right[j]) {
				arr[k] = left[i];
				i++;
			}else if(left[i]>right[j]) {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<l) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j<r) {
			arr[k] = right[j];
			j++;
			k++;
		}
		return arr;
	}
}


















