package com.dsa.linkedList;

public class Main {
	public static void main(String[] args) {
		LL list = new LL();
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		list.insertFirst(6);
		
		list.display();
		list.insertR(12, 2);
		list.display();
		
//		list.insertLast(2);
//		list.display();
//		
//		list.insert(7, 3);
//		list.display();
//		System.out.println("First value deleted is : "+ list.deleteFirst());
//		list.display();
//		System.out.println("Last value deleted is : "+ list.deleteLast());
//		list.display();
//		System.out.println("deleted value from position is : "+ list.delete(2));
//		list.display();
//		list.size();
		
		
//		DLL list = new DLL();
//		list.insertFirst(5);
//		list.insertFirst(4);
//		list.insertFirst(3);
//		list.insertFirst(2);
//		list.insertFirst(1);
//		list.insertLast(6);
//		list.insertLast(7);
//		list.insert(4, 9);
//		list.insert(7, 8);
//		list.display();
		
//		CLL list = new CLL();
//		list.insert(1);
//		list.insert(2);
//		list.insert(3);
//		list.insert(4);
//		list.insert(5);
//		list.display();
//		list.delete(3);
//		list.display();
		
	}
}
