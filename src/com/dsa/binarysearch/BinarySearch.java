package com.dsa.binarysearch;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] arr = {-2, 4, 55, 66, 77, 78, 98};
		int target = 33;
		
		int index = (binarySearch(arr, target));
		
		System.out.println(index);

	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
	
		while(start<=end) {
//			int mid = (start+end)/2;
			
			int mid = start + (end - start)/2;
			if(target<arr[mid]) {
				end = mid-1;
				 
			}
			else if(target>arr[mid]) {
				start = mid+1;
				
			}
			else {
				return mid;
			}
		}
		return -1;

	}
}
