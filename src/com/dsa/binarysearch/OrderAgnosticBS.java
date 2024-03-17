package com.dsa.binarysearch;

public class OrderAgnosticBS {
public static void main(String[] args) {
//	int[] arr = {-2, 4, 55, 66, 77, 78, 98};
	
	int arr[] = {98, 78, 66, 55, 33, 22, 11,-1, -22};
	int target = 98;
	
	int index = (orderAgnosticBS(arr, target));
	
	System.out.println(index);
}

static int orderAgnosticBS(int[] arr , int target) {
	int start = 0;
	int end = arr.length-1;
	
	boolean isAsc = arr[start] < arr[end];

	while(start<=end) {
//		int mid = (start+end)/2;
		
		int mid = start + (end - start)/2;
		
		if(arr[mid] == target) {
			return mid;
		}
		
		if(isAsc) {
			if(target<arr[mid]) {
				end = mid-1;
				 
			}
			else if(target>arr[mid]) {
				start = mid+1;
				
			}
		}else {
			if(target<arr[mid]) {
				start = mid+1;
				 
			}
			else if(target>arr[mid]) {
				
				end = mid-1;
			}
		}
		
	}
	return -1;
}
}
