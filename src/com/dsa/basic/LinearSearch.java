package com.dsa.basic;

public class LinearSearch {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5, 6, 10};
		int target = 19;
		int index = linearSearch(num, target);
		System.out.println(index);
	}
	
	static int linearSearch(int[] arr , int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int i= 0 ; i<arr.length ; i++) {
			int element = arr[i];
			if(element==target) {
				return i; 
			}
		}
		return -1;
	}
}
 