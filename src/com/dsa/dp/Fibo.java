package com.dsa.dp;

import java.util.Arrays;

public class Fibo {
	public static void main(String[] args) {
		int n =19 ;
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
//		System.out.println(fibo(n , dp));
//		System.out.println(fibo1(5, dp))
		System.out.println(fibo2(5));
	}
	
	public static int fibo(int n , int[] dp) { //memoization - top down 
		if(n<=1) {
			return n;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		return dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
	}
	
	public static int fibo1(int n , int[] dp) { //tabulation - bottom up
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2 ; i<=n ; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
	
	public static int fibo2(int n) { //space optimised code 
		int prev2 = 0;
		int prev = 1;
		for(int i = 2 ; i<=n ; i++) {
			int curri = prev + prev2;
			prev2 = prev;
			prev = curri;
		}
		return prev;
	}
	
}
