package com.dsa.string;

public class Palindrome {
	public static void main(String[] args) {
		String s = "acbca";
		System.out.println(check(s));
	}
	
	
	static boolean check(String s) { 
		if(s==null || s.length()==0) {
			return true;
		}
		int start = s.charAt(0);
		int end = s.charAt(s.length()-1);
		
		while(start<=end) {
			if(start!=end) {
				return false;
			}else {
				start++;
				end--;
			}
		}
		return true;	
	}
}
