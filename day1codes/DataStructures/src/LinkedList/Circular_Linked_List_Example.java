package LinkedList;

import java.util.Scanner;

import Queue.SlidingWindow_Queue;

public class Circular_Linked_List_Example {

	Node root,last;
	
	void createList() {
		root=last=null;
	}
	
	void insertLeft(int data)
	{
		Node n = new Node(data);
		if(root==null) {
			root=last=n;
			last.next=root;
		}
		else {
			n.next=root;
			root=n;
			last.next=root;
		}
	}
	void deleteLeft()
	{
		Node t;
	      if(root==null)
	          System.out.println("Empty List");
	      else
	      {
	          t=root;//1:t=100
	          if(root==last)
	           {root=last=null;}
	          else
	          {
	              root=root.next;//2:
	              last.next=root;//3
	          }
	          System.out.println("Deleted:"+t.data);
	      }
	}
	void insertRight(int data)
	{
		Node n = new Node(data);
		if(root==null)
			root=last=n;
		else {
			last.next=n; //1
			last=n; //2
			last.next=root; //3
		}
	}
	void deleteRight()
	{
		if(root==null)
	          System.out.println("Empty List");
	      else
	      {
	          Node t,t2;
	          t=t2=root;//1:t=100
	          while(t!=last)//2
	          {
	              t2=t;
	              t=t.next;
	          }
	          if(t==root)//single node
	          { root=last=null;}
	          else
	          {   last=t2;//3
	              last.next=root;//4
	          }//3
	          System.out.println("Deleted:"+t.data);
	      }
		
	}
	void printList()
	{
		if(root==null)
	          System.out.println("Empty List");
	      else
	      {
	          Node t=root;
	          do
	          {
	              System.out.print("|"+t.data+"|->");
	              t=t.next;
	          }while(t!=root);
	      }
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Circular_Linked_List_Example obj = new Circular_Linked_List_Example();
		
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
