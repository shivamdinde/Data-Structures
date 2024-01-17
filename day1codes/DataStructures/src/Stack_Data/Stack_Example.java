package Stack_Data;

import java.util.Scanner;

public class Stack_Example {
	
	int Maxsize,tos,stack[];
	void createStack(int size)
	{
		Maxsize=size;
		tos=-1;
		stack=new int [Maxsize];
	}
	
	void push(int e)
	{
		tos++;
		stack[tos]=e;
		System.out.println("Pushed "+e);
	}
	
	boolean isFull()
	{
		if(tos==Maxsize-1)
			return true;
		else
			return false;
	}
	
	int pop() 
	{
		int temp = stack[tos];
		tos--;
		return temp;
	}
	
	boolean isEmpty()
	{
		if(tos==-1)
			return true;
		else
			return false;
	}
	
	int peek()
	{
		return stack[tos];
	}
	
	void printStack() 
	{
		System.out.println("Stack Has: ");
		for(int i=tos;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Stack_Example obj = new Stack_Example();
		System.out.println("Enter the size of stack: ");
		int size = in.nextInt();
		
		int choice;
		obj.createStack(size);
		do {
			System.out.println("1.Push\n2.Pop\n3.Peek\n4.Print\n.0.Exit");
			choice = in.nextInt();
			
			switch(choice) {
			case 1:
				if (obj.isFull()!=true) {
					System.out.println("Enter Element: ");
					int e = in.nextInt();
					obj.push(e);
				}
				else
					System.out.println("Stack Full");
				break;
				
			case 2:
				if (obj.isEmpty()!=true) {
					System.out.println("Element Poped: "+obj.pop());
				}
				else
					System.out.println("Stack Empty");
				break;

			case 3:
                if(obj.isEmpty()!=true)//if not empty then pop
                {
                    System.out.print("Element at Peek is:"+obj.peek());
                }
                else
                    System.out.print("Stack Empty");
                break;
                
            case 4:
                if(obj.isEmpty()!=true)//if not empty then pop
                	obj.printStack();
                else
                    System.out.print("Stack Empty");
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
