package com.dsa.basic;

import java.util.Scanner;

public class PositiveNegative {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int p = sc.nextInt();
	
	
	if(p<0) {
		System.out.println(p+" is negative number");
	}else {
		System.out.println(p+" is positive number");
	}
}
}
