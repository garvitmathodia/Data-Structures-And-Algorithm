package com.dsa.math;

import java.util.ArrayList;

public class Factors {
	public static void main(String[] args) {
		sqrt1(20);
	}
	static void sqrt(int n) {
		for(int i = 1 ; i<=Math.sqrt(n) ; i++) {
			if(n%i==0) {
				if(n/i==i) {
					System.out.println(i);
				}else {
					System.out.println(i);
					System.out.println(n/i);
				}
			}
		}
	}
	
	static void sqrt1(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1 ; i<=Math.sqrt(n) ; i++) {
			if(n%i==0) {
				if(n/i==i) {
					System.out.println(i);
				}else {
					System.out.println(i);
					list.add(n/i);
				}
			}
		}
		for(int i = list.size()-1 ; i>=0 ; i--) {
			System.out.println(list.get(i));
		}
	}	
}
