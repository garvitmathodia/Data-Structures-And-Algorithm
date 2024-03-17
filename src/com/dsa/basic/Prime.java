package com.dsa.basic;

public class Prime {
	
public static boolean isPrime(int n) {	
	
	for(int i=2 ; i<=Math.sqrt(n) ; i++) {
		if(n%i==0) {
		return false;
		}
	}
	return true;
}

public static void primesInRange(int n) {
	for(int i = 2 ; i<n ; i++) {
		if(isPrime(i)) {
			System.out.println(i+" ");
		}
	}
	
}
	
public static void main(String[] args) {
	
	primesInRange(20);
//	System.out.println(isPrime(5));
}
}
