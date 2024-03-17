package com.dsa.revise;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {2 ,1 ,4 , 8 , 9, 9, 9, 12};
		System.out.println(Search(arr , 0 , 2));
	}
	
	public static int Search(int[] arr , int i , int t) {
		if(i==arr.length) {
			return -1;
		}
		
		if(arr[i]==t) {
			return i;
		}
		
		return Search(arr , i+1 , t);
	}
}
