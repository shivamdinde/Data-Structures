package Stack_Data;

import java.util.Scanner;

public class Max_Stack {

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

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Max_Stack normal = new Max_Stack();
		Max_Stack max = new Max_Stack();
		System.out.println("Enter the size of stack: ");
		int size = in.nextInt();
		
		normal.createStack(size);
		max.createStack(size);
		
		int choice;
		normal.createStack(size);
		do {
			System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n5.Max\n0.Exit");
			choice = in.nextInt();
			
			switch(choice) {
			case 1:
				if (normal.isFull()!=true) {
					System.out.println("Enter Element: ");
					int e = in.nextInt();
					 if(max.isEmpty())
                     { System.out.print("Max updated:");
                         max.push(e);
                     }
                     else if(e>max.peek())
                     { System.out.print("Max updated:");
                         max.push(e);
                     }
                     normal.push(e);
                     }
				
				else
					System.out.println("Stack Full");
				break;
				
			case 2:
				if(normal.isEmpty()!=true)//if not empty then pop
				{
	                if (normal.peek()==max.peek())
	                    System.out.print("Max Stack also poped:"+max.pop());
	                System.out.print("poped:"+normal.pop());
                
				}
				else
					System.out.print("Stack Empty");
				break;

			case 3:
                if(normal.isEmpty()!=true)//if not empty then pop
                {
                    System.out.print("Element @ Peek is:"+normal.peek());
                }
                else
                    System.out.print("Stack Empty");
                break;
                case 5:
                if(max.isEmpty()!=true)//if not empty then pop
                {
                    System.out.print("Max Element @ is:"+max.peek());
                }
                else
                    System.out.print("Stack Empty");
                break;
                
                case 4:
                    if(normal.isEmpty()!=true)//if not empty then pop
                    {
                      normal.printStack();
                    }
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

