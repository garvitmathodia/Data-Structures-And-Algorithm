package com.dsa.basic;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isArmstrong(n));
	}

	static boolean isArmstrong(int n) {
		int temp = n;
		int sum = 0;
		while(temp!=0) {
			int rem = temp%10;
			sum = sum+(rem*rem*rem);
			temp=temp/10;
		}
//		if(sum==n) {
//			return true;
//		}
//			
//		else {
//			return false;
//		}
		return sum==n;

	}
}
