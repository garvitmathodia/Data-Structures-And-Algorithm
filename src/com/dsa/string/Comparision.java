package com.dsa.string;

public class Comparision {
public static void main(String[] args) {
	String a ="garvit";
	String b = "garvit";
	System.out.println(a==b);
	
	String c = new String("garvit");
	String d = new String("garvit");
	System.out.println(c==d); //checks reference	
	System.out.println(c.equals(d));  //only checks value
}
}
