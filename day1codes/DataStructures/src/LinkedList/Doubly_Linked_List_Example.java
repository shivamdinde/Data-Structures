package LinkedList;

import java.util.Scanner;

import Queue.SlidingWindow_Queue;

public class Doubly_Linked_List_Example {

	Doubly_Node root;
	
	void createList() {
		root=null; //Nullify root - assigning it null so we know when to use it.
	}
	
	void insertLeft(int data)
	{
		Doubly_Node n = new Doubly_Node(data);
		if(root==null)
			root=n;
		else {
			n.right=root;
			root.left=n; 
			root=n;
		}
	}
	void deleteLeft()
	{
		Doubly_Node t; 
		
		if(root==null)
			System.out.println("Empty List");
		else {
			t=root;//1:t=100
	          if(root.left==null && root.right==null)
	              root=null;
	          else
	          {
	           root=root.right;//2
	           root.left=null;//3
	          }
	          System.out.println("Deleted:"+t.data);
		}
	}
	void insertRight(int data)
	{
		Doubly_Node n = new Doubly_Node(data);
		if(root==null)
			root=n;
		else {
			Doubly_Node t= root; //1:
			while(t.right!=null) //2:
				t=t.right;
			t.right=n; //3:
			n.left=t; //4
		}
	}
	void deleteRight()
	{
		Doubly_Node t,t2;
		t=t2=root; //1:
		
		while(t.right!=null) {     //2:
			t=t.right;
		}
		if (t==root)
			root=null;
		else {
			t2=t.left;//3
			t2.right=null; //4
		}
			
		System.out.println("Deleted: "+t.data);
		
	}
	void printListLR()
	{
		if(root==null)
	          System.out.println("Empty List");
	      else
	      {
	          Doubly_Node t=root;
	          while(t!=null)
	          {
	              System.out.print("|"+t.data+"|->");
	              t=t.right;
	          }
	      }
	}
	void printListRL()
	{
		if(root==null)
	          System.out.println("Empty List");
	      else
	      {
	          Doubly_Node t=root;
	          while(t.right!=null)
	        	  t=t.right;
	          while(t!=null)
	          {
	        	  System.out.print("|"+t.data+"|->");
	        	  t=t.left;
	          }
	      }
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Doubly_Linked_List_Example obj = new Doubly_Linked_List_Example();
		
		int choice;
		obj.createList();
		
		do {
			System.out.println("\n1.Insert Left\n2.Delete Left\n3.Insert Right\n4.Delete Right\n5.PrintLR\n6.PrintRL\n0.Exit");
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
				System.out.println("Left to Right Data");
				obj.printListLR();
				break;
				
			case 6:
				System.out.println("Right to Left Data");
				obj.printListRL();
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
