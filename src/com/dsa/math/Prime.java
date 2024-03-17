package com.dsa.math;

public class Prime {
	public static void main(String[] args) {

		 prime(5);
	}

	static void prime(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}
}
