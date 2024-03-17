package com.dsa.stack;

public class CustomStackLL {

	public static class Node {
		int val;
		Node next;

		public Node(int val) {

			this.val = val;
		}

	}

	public static class Stack {
		private Node head = null;
		private int size = 0;

		void push(int x) {
			Node temp = new Node(x);
			temp.next = head;
			head = temp;
			size++;
		}

		void displayRev() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.val + " ");
				temp = temp.next;
			}
			System.out.println();
		}
		
		void displayRec(Node h) {
			if(h==null) {
				return;
			}
			displayRec(h.next);
			System.out.print(h.val+ " ");
		}
		
		void display() {
			displayRec(head);
			System.out.println();
		}

		int size() {
			return size;
		}

		int pop() {
			if (head == null) {
				System.out.println("Stack is empty");
				return -1;
			}
			int ele = head.val;
			head = head.next;
			size--;
			return ele;
		}

		int peek() {
			if (head == null) {
				System.out.println("Stack is empty");
				return -1;
			}
			return head.val;
		}
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.display();
		System.out.println(st.peek());
		st.pop();
		st.display();
		System.out.println(st.size());
	}
}
