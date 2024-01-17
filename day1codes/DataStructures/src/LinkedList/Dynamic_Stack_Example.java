package LinkedList;

import java.util.Scanner;


public class Dynamic_Stack_Example {

	Node tos;

    void createStack()
    {
        tos=null;//root is never created but assigned as per need
        //the 1st node is called root
    }

    void push(int e)
    {
        Node n=new Node(e);
        if(tos==null)
            tos=n;
        else
        {
            n.next=tos;//1
            tos=n;//2
        }
    }

    void pop()
    {
        if(tos==null)
            System.out.println("Empty List");
        else
        {
          Node t=tos;//1
          tos=tos.next;//2
          System.out.println("Popped Data"+t.data);
        }
    }
    void peek()
    {
        if(tos==null)
            System.out.println("Empty List");
        else
        {
          System.out.println("Peeked Element:"+tos.data);
        }
    }
    void printStack()
    {  if(tos==null)
                System.out.println("Empty Stack");
       else
       {
           Node t=tos;
           while(t!=null)
           {
               System.out.println(t.data);
               t=t.next;
           }
       }
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Dynamic_Stack_Example obj = new Dynamic_Stack_Example();
		
		int choice;
		obj.createStack();
		
		do {
			System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print Stack\n0.Exit");
			choice = in.nextInt();
			
			switch(choice) {
			
			case 1: 
				System.out.println("Push data: ");
				int n1 = in.nextInt();
				obj.push(n1);
				break;
			
			case 2:
				obj.pop();
				System.out.println("Popped data");
				break;
			
			case 3:
				obj.peek();
				break;
			
			case 4:
				obj.printStack();
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
