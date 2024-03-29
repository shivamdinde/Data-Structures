package LinkedList;

import java.util.Scanner;

import Queue.SlidingWindow_Queue;

public class Dynamic_Queue_Example {

	Node tos;
	
	void createQueue() {
		tos=null;
	}
	void dequeue()
	{
		Node t; 
		
		if(tos==null)
			System.out.println("Empty Queue");
		else {
			t=tos;
			tos = tos.next;
			System.out.println("Dequeued:"+t.data);
		}
	}
	
	void enqueue(int data)
	{
		Node n = new Node(data);
		if(tos==null)
			tos=n;
		else {
			Node t= tos; 
			while(t.next!=null) 
				t=t.next;
			t.next=n; 
		}
	}
	
	void printList()
	{
		if(tos==null)
	          System.out.println("Empty Queue");
	      else
	      {
	          Node t=tos;
	          while(t!=null)
	          {
	              System.out.println(t.data+"---->");
	              t=t.next;
	          }
	      }
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Dynamic_Queue_Example obj = new Dynamic_Queue_Example();
		
		int choice;
		obj.createQueue();
		
		do {
			System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit");
			choice = in.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Insert data Enqueue");
				int n2 = in.nextInt();
				obj.enqueue(n2);
				break;
			case 2:
				obj.dequeue();
				System.out.println("Dequeued Data");
				break;
				
			case 3:
				System.out.println("Queue Has: ");
				obj.printList();
				break;
				
			case 0:
                System.out.print("Exiting code");
                break;
			 default:
                System.out.print("Wrong input");
                break;
			}
			
			
		}while(choice!=0);
		
	}
}
