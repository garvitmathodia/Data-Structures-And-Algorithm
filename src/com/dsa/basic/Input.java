package com.dsa.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = new int[5];
	
	for(int i = 0 ; i<a.length ; i++) {
		a[i] = sc.nextInt();
	}
	
//	for(int i = 0 ; i<a.length ; i++) {
//		System.out.print(a[i]+" "); 
//	}
//	
//	for(int j : a) {
//		System.out.println(j);
//	}
	
	System.out.println(Arrays.toString(a));
}
}
