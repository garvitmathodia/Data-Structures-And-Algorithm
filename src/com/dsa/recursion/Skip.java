package com.dsa.recursion;

public class Skip {
	public static void main(String[] args) {
		String s = "baccappled";
		String ans = skipApple(s);
		System.out.println(ans);
	}
	
	static String skip(String s) {
		if(s.isEmpty()) {
			return "";
		}
		char ch = s.charAt(0);
		if(ch=='a') {
			return skip(s.substring(1));
		}else {
			return ch+ skip(s.substring(1));
		}
	}
	
	static String skipApple(String s) {
		if(s.isEmpty()) {
			return "";
		}
		
		if(s.startsWith("apple")) {
			return skipApple(s.substring(5));
		}else {
			return s.charAt(0) + skipApple(s.substring(1));
		}
	}
}
