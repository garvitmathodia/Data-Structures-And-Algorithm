package com.dsa.sorting;

import java.util.Arrays;

public class Sortings {
	public static void main(String[] args) {
		int[] arr = {5,3,4,1,2}; 
//		selectionSort(arr);
//		insertionSort(arr);
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubbleSort(int[] arr) {
		boolean swap;
		for(int i =0 ; i<arr.length ; i++) {
			swap = false;
			for(int j =1 ; j<arr.length-i ; j++) {
				if(arr[j]<arr[j-1]) {
					swap(arr, j, j-1);
					swap = true;
				}
			}
			if(swap==false) {
				break;
			}
		}
	}
	
	static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last = arr.length-i-1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr, last, maxIndex);
		}
	}
	
	static void insertionSort(int[] arr) {
		for(int i = 0 ; i<arr.length-1 ; i++) {
			for(int j=i+1 ; j>0 ; j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr, j, j-1);
				}
				else {
					break;
				}
			}
		}
	}
	
	static void swap(int[] arr , int index1 , int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	static int getMaxIndex(int[] arr , int start , int end) {
		int max = start;
		for(int i = start+1 ; i<=end ; i++) {
			if(arr[i]>arr[max]) {
				max = i;
			}
		}
		return max;
	}
	
	
}
