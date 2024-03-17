package com.dsa.recursion;

public class CountZero {
	public static void main(String[] args) {
//		count(120021);
		System.out.println(count1(122112100));
	}
	static int count = 0;
	static void count(int n) {
		
		if(n==0) {
			return ;
		}
		
		int rem = n%10;
		if(rem==0) {
			count++;
		}
		count(n/10);
		
	}
	
	static int count1(int n) {
		return helper(n , 0);
	}
	
	static int helper(int n  , int c) {
		if(n==0) {
			return c;
		}
		int rem = n%10;
		if(rem==0) {
			return helper(n/10, c+1);
		}else {
			return helper(n/10, c);
		}
	}
}
