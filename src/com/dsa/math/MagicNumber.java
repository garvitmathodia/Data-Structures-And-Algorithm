package com.dsa.math;

public class MagicNumber {
public static void main(String[] args) {
	int n = 6;
	int ans = 0;
	int base=5;
	//complexity of this ans is log(n) as this loop is running log(n) times..
	while(n>0) {
		int last = n&1;
		n = n>>1;
		ans +=last * base;
		base = base*5;
	}
	System.out.println(ans);
}
}
