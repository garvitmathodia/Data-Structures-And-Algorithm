package com.dsa.basic;

public class MinInArray {

	public static void main(String[] args) {
		int[] num = {23, 233, 54, 7, 5, 6, 10 , -2};
		
		System.out.println(min(num));
	}
	
	static int min(int[] arr) {
		int min = arr[0];
		for(int i = 0 ; i<arr.length ; i++) {
			if(min>arr[i]) {
				min = arr[i];
				
			}
		}
		return min;
		
	}
}
