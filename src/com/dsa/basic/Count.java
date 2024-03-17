package com.dsa.basic;

public class Count {
public static void main(String[] args) {
	int x = 321423;
	int res = 0;
	while(x>0) {
		x = x/10;
		res++;
	}
	System.out.println(res);
}
}
