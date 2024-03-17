package com.dsa.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<>();
//	list.add(10);
//	System.out.println(list);
	
	for(int i = 0 ; i<5 ; i++) {
		list.add(sc.nextInt());
	}
	
	for(int i =0 ; i<5 ; i++) {
		System.out.println(list.get(i));
	}
		
}
}
