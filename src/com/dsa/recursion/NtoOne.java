package com.dsa.recursion;

public class NtoOne {
	public static void main(String[] args) {
		print1(5);
	}

	static void print(int n) {
		System.out.println(n);
		if (n == 1) {
			return;
		}
		print(n - 1);
	}

	static void print1(int n) {
		if (n == 0) {
			return;
		}

		print1(n - 1);
		System.out.println(n);

	}
}
