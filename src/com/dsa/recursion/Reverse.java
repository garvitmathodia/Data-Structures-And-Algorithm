package com.dsa.recursion;

public class Reverse {
	public static void main(String[] args) {
		
		System.out.println(helper(112233));
	}
	
	static int sum = 0;
	static void reverse(int n) {
		if(n==0) {
			return;
		}
		int rem = n%10;
		sum = sum*10 + rem;
		reverse(n/10);
	}
	
//	Method2...
	
	static int helper(int n) {
		int digits = (int)Math.log10(n) + 1;
		return reverse1(n , digits);
	}
	
	static int reverse1(int n , int digits) {
		if(n%10==n) {
			return n;
		}
		int rem = n%10;
		return (rem*(int)(Math.pow(10, digits-1)) + reverse1(n/10, digits-1));
	}
}
