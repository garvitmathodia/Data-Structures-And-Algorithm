package com.dsa.math;

public class Seive {
	public static void main(String[] args) {
		int n = 40;
		boolean[] primes = new boolean[n + 1];
		seive(n, primes);
	}
	
	//time complexity of this code is N * log(log(N)) as it forms the the hp N/2 + N/3 + N/5 + N/7.......

	static void seive(int n, boolean[] primes) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (!primes[i]) {
				for (int j = i * 2; j <= n; j += i) {
					primes[j] = true;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (!primes[i]) {
				System.out.println(i);
			}
		}
	}
}
