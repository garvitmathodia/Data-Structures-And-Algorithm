package com.dsa.basic;

import java.util.Scanner;

public class CountDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Long n = sc.nextLong();
	int check = sc.nextInt();
	
	int count = 0;
	
	while(n!=0) {
		int rem = (int)(n%10);
		if(rem==check) {
			count++;
		}
		n=n/10;
	}
	System.out.println(count);
	
}
}
