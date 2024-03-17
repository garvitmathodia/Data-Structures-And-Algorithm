package com.dsa.basic;

public class PassByValue {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	
	change(arr);
	
	System.out.println(arr[0]);
	
}

public static void change(int[] brr) {
	
	brr[0] = 99;
}
}
