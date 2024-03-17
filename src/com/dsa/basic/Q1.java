package com.dsa.basic;

import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
//	int a = scanner.nextInt();
//	int b = scanner.nextInt();
//	int c = scanner.nextInt();
//	
//	float f = a+b+c/3f;
//	System.out.println(f);
	
//	int side = scanner.nextInt();
//	int area = side*side;
//	System.out.println(area);
// hello
	
	float pencil = scanner.nextFloat();
	float pen = scanner.nextFloat();
	float eraser = scanner.nextFloat();
	
	float total = (pencil+pen+eraser);
	float total_gst = total+total*18/100f;
	System.out.println(total_gst);
	
	int $ = 24;
	
	
}
}
