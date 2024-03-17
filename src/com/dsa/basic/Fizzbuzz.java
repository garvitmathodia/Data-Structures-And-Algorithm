package com.dsa.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i = 1 ; i<=a ; i++ ) {
			
			 if(i%3==0 && i%5==0) {
				list.add("Fizzbuzz");
			}
			
			 else if(i%3==0) {
				list.add("Fizz");
			}
			else if(i%5==0) {
				list.add("buzz");
			}
			
			else {
				list.add(Integer.toString(i));
			}
			
		}
		System.err.println(list);
	}
}
