package LinkedList;

import java.util.Scanner;

import Queue.SlidingWindow_Queue;

public class Linear_Linked_List_Example {

	Node root;
	
	void createList() {
		root=null; //Nullify root - assigning it null so we know when to use it.
	}
	
	void insertLeft(int data)
	{
		Node n = new Node(data);
		if(root==null)
			root=n;
		else {
			n.next=root; //1100
			root=n;  //root=800
		}
	}
	void deleteLeft()
	{
		Node t;  //a local variable
		
		if(root==null)
			System.out.println("Empty List");
		else {
			t=root; //1: t=100
			root = root.next; //2:
			System.out.println("Deleted:"+t.data);
		}
	}
	void insertRight(int data)
	{
		Node n = new Node(data);
		if(root==null)
			root=n;
		else {
			Node t= root; //1:
			while(t.next!=null) //2:
				t=t.next;
			t.next=n; //3:
		}
	}
	void deleteRight()
	{
		Node t,t2;
		t=t2=root; //1:
		
		while(t.next!=null) {     //2:
			t2=t;
			t=t.next;
		}
		if (t==root) //single node
			root=null;
		else
			t2.next=null; //3:
		System.out.println("Deleted: "+t.data);
		
	}
	void printList()
	{
		if(root==null)
	          System.out.println("Empty List");
	      else
	      {
	          Node t=root;
	          while(t!=null)
	          {
	              System.out.print("|"+t.data+"|->");
	              t=t.next;
	          }
	      }
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Linear_Linked_List_Example obj = new Linear_Linked_List_Example();
		
		int choice;
		obj.createList();
		
		do {
			System.out.println("\n1.Insert Left\n2.Delete Left\n3.Insert Right\n4.Delete Right\n5.Print\n0.Exit");
			choice = in.nextInt();
			
			switch(choice) {
			
			case 1: 
				System.out.println("Insert Left node data: ");
				int n1 = in.nextInt();
				obj.insertLeft(n1);
				break;
			
			case 2:
				obj.deleteLeft();
				System.out.println("Left data deleted");
				break;
			
			case 3:
				System.out.println("Insert Right node data: ");
				int n2 = in.nextInt();
				obj.insertRight(n2);
				break;
				
			case 4:
				obj.deleteRight();
				System.out.println("Right data deleted");
				break;
			
			case 5:
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
