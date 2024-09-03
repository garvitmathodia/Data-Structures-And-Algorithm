package com.dsa.demo;

public class Demo {

	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			System.out.println("hll");
		} /*catch (ArithmeticException ee) {
			System.out.println("hll");
		}*/
	}
}
