package com.dsa.string;

import java.util.Scanner;

public class Toggle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StringBuilder str = new StringBuilder(sc.nextLine());
	for(int i = 0 ; i<str.length() ; i++) {
		boolean flag = true; //capital
		char ch = (char)str.charAt(i);
		if(ch==' ') continue;
		int ascii = (int)ch;
		if(ascii>=97) {
			flag = false;
		}
		
		if(flag==true) {
			ascii += 32;
			char dh = (char)ascii;
			str.setCharAt(i, dh);
		}else {
			ascii -=32;
			char dh = (char)ascii;
			str.setCharAt(i, dh);
		}
		
	}
	System.out.println(str);
}
}