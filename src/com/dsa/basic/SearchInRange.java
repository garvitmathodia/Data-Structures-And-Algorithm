package com.dsa.basic;

public class SearchInRange {
	
	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5, 6, 10};
		
		int result = linearSearch(num, 5, 1, 4);
		System.out.println(result);
		
	}
	
	static int linearSearch(int[] arr , int target , int start , int end) {
		if(arr.length==0) {
			return -1;
		}
		for(int i= start ; i<=end ; i++) {
			int element = arr[i];
			if(element==target) {
				return i; 
			}
		}
		return -1;
	}
 
}
