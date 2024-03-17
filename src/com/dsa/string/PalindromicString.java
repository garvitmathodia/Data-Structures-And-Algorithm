package com.dsa.string;

public class PalindromicString {
	public static void main(String[] args) {
		String s = "abba";
		int count=0;
		for(int i = 0 ; i<s.length() ; i++) {
			for(int j = i+1 ; j<=s.length() ; j++) {
				if(check(s.substring(i, j))==true) {
					count++;
				}
			}
		}
		System.out.println(count);
		
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
