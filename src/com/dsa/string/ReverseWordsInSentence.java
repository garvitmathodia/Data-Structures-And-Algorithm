package com.dsa.string;

public class ReverseWordsInSentence {
public static void main(String[] args) {
	String s = "Garvit is very good in java programming language";
	String ans = "";
	StringBuilder ss = new StringBuilder("");
	for(int i = 0 ; i<s.length() ; i++) {
		char ch = s.charAt(i);
		if(ch!=' ') {
			ss.append(ch);
		}else {
			ss.reverse();
			ans +=ss;
			ans +=" ";
			ss = new StringBuilder("");
		}
		
	}
	ss.reverse();
	ans +=ss;
	System.out.println(ans);
}
}
