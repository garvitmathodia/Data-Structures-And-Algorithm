package com.dsa.queue;

public class CircularQueueArray {

	public static class CQueue{
		int front = -1;
		int rear = -1;
		int size = 0;
		int[] arr = new int[8];
		
		public void add(int x) throws Exception {
			if(size==arr.length) {
				throw new Exception("Queue is full");
			}
			else if(size == 0) {
				front=rear=0;
				arr[rear] = x;
			}
			else if(rear<arr.length-1) {
				arr[++rear] = x;
			}
			else if(rear==arr.length-1) {
				rear = 0;
				arr[rear] = x;
			}
			
			size++;
			
		}
		
		public int remove() throws Exception {
			if(size==0) {
				throw new Exception("Queue is Empty!");
			}
			else {
				int val = arr[front];
				if(front==arr.length-1) {
					front =0;
				}else {
					front++;
				}
				size--;
				return val;
			}
			
		}
		
		public int peek() throws Exception{
			if(size==0) {
				throw new Exception("Queue is Empty!");
			}
			return arr[front];
		}
		
		public void display() {
			if(size==0) {
				System.out.println("Queue is Empty!");
				return;
			}
			else if(front<=rear) {
				for(int i = front ; i<=rear ; i++) {
					System.out.print(arr[i] + " ");
				}
			}else {
				for(int i = front ; i<arr.length ; i++) {
					System.out.print(arr[i] + " ");
				}
				
				for(int j = 0 ; j<=rear ; j++) {
					System.out.print(arr[j] + " ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		CQueue q = new CQueue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.display();
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		q.display();
		q.add(9);
		q.add(10);
		q.add(11);
		q.add(12);
		q.display();
	}
}
