package com.dsa.math;

public class PowerOfTwo {
	public static void main(String[] args) {
		int a = 8; //fix for n =0
		boolean ans = (a&(a-1))==0;
		
		System.out.println(ans);
	}
}
