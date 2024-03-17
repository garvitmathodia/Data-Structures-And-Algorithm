package com.dsa.recursion;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		if(arr.length==0) {
			System.out.println(-1);
			return;
		}
		int start = 0;
		int end = arr.length-1;
		int target = 9;
		int index = search(arr, target , start , end);
		System.out.println(index);
	}
	
	static int search(int[] arr , int target , int start , int end) {
		if(start>end) {
			return -1;
		}
		int mid = start + (end-start)/2;
		if(arr[mid]==target) {
			return mid;
		}
	
		if(arr[mid]>target) {
			return search(arr, target, start, mid-1);
		}else{
			return search(arr, target, mid+1, end);
		}
		
	}
}
