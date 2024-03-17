package com.dsa.tree;

import java.util.Scanner;

public class BinaryTree {

	private class Node{
		Node left;
		Node right;
		int val;
		
		Node(int val){
			this.val = val;
		}
	}
	
	public BinaryTree() {
		
	}
	
	private Node root;
	
	public void insert(Scanner scanner) {
		System.out.println("Enter the value of Root node");
		int val = scanner.nextInt();
		root = new Node(val);
		insert(scanner , root);
	}
	
	private void insert(Scanner scanner , Node node) {
		System.out.println("Do you want to insert in the left of Node..?");
		boolean left = scanner.nextBoolean();
		if(left) {
			System.out.println("Enter the value to be inserted in the left node");
			int val = scanner.nextInt();
			node.left = new Node(val);
			insert(scanner, node.left);
		}
		
		System.out.println("Do you want to insert in right of Ndoe..?");
		boolean right = scanner.nextBoolean();
		if(right) {
			System.out.println("Enter the value to be inserted int right of node");
			int val = scanner.nextInt();
			node.right = new Node(val);
			insert(scanner , node.right);
		}
	}
	
	public void display() {
		display(root);
	}
	private void display(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.val);
		display(node.left);
		display(node.right);
	}
	
}
