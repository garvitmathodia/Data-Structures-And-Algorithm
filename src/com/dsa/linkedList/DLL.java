package com.dsa.linkedList;


public class DLL {
	
	private Node head;
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		if(head!=null) {
			head.prev = node;
		}
		head = node;
	}
	
	public void insertLast(int value) {
		Node node = new Node(value);
		Node temp = head;
		node.next = null;
		if(head==null) {
			node.prev = null;
			head = node;
			return;
		}
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = node;
		node.prev = temp;
	}
	
	public void display() {
		Node temp = head;
//		Node last = null;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
//			last = temp;
			temp = temp.next;
		}
		System.out.println("End");
		
//		while(last!=null) {
//			System.out.print(last.value + " -> ");
//			last = last.prev;
//		}
//		System.out.println("Start");
	}
	
	public Node find(int value) {
		Node node = head;
		while(node!=null) {
			if(node.value==value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	
	public void insert(int after , int value) {
		Node p = find(after);
		if(p==null) {
			System.out.println("Not Exist");
		}
		Node node = new Node(value);
		node.next = p.next;
		p.next = node;
		node.prev = p;
		if(node.next!=null) {
			node.next.prev = node;
		}
		
	}
	

	private class Node {

		private int value;
		private Node next;
		private Node prev;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next ,Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}
	
}
