package com.dsa.stack;

import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		Stack st = new Stack<>();
		st.add(1);
		st.add('A');
		st.add(23);
		st.add(12);
		st.add(11);
		System.out.println(st.search('A'));
	}
}
