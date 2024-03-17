package com.dsa.recursion;

public class DigitSum {
	public static void main(String[] args) {
		System.out.println(sum(16798));
	}
	
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		 
		return n%10+ sum(n/10);
	}
}
