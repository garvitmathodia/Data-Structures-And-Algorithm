package com.dsa.recursion;

public class Main {
	public static void main(String[] args) {

		print(1);
	}
	static void print(int n) {
		if(n==5) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		//this is called tail recursion as it has last function to call..
		print(n+1);
	}
}
