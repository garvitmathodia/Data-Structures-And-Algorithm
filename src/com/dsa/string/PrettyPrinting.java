package com.dsa.string;

import java.util.ArrayList;

public class PrettyPrinting {
public static void main(String[] args) {
//	float f = 1.42543f;
//	System.out.printf("formatted number is %.2f" , f);
	
//	System.out.printf("pie %.3f" , Math.PI);
	
	System.out.println("a" + 1);
	System.out.println("garvit" + new ArrayList<>());
	System.out.println(new Integer(56) + "" + new ArrayList<>());
//	System.out.println(new Integer(56)  + new ArrayList<>());  this will show error because this is only allowed with primitives and strings only(only in case of +)
}
}
