package com.dsa.revise;

public class CheckSorted {

	public static void main(String[] args) {
		int[] arr = {2 ,1 ,4 , 8 , 9, 12};
		System.out.println(Helper(arr , 1));
	}
	
	public static boolean Helper(int[] arr , int i) {
		if(i==arr.length) return true;
		
		return arr[i]>arr[i-1] && Helper(arr , i+1);
	}
}
