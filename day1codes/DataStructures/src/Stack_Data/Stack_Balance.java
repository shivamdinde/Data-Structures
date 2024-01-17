package Stack_Data;

import java.util.Scanner;

public class Stack_Balance {

	int Maxsize,tos;
	char stack[];
	void createStack(int size)
	{
		Maxsize=size;
		tos=-1;
		stack=new char[Maxsize];
	}
	
	void push(char e)
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
	
	char pop() 
	{
		char temp = stack[tos];
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
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
        Stack_Balance obj=new Stack_Balance();
        System.out.print("Enter data:");
        String data=in.nextLine();
        boolean flag=true;
        char e;
        int i;
        obj.createStack(data.length());//creates array of size data
        for (i=0;i<data.length();i++)
        {
            char c=data.charAt(i);
            if(c=='{')
                obj.push(c);        
            else if(c=='}' && !obj.isEmpty())
                {
                    e=obj.pop();
                }
            else if(c=='}' && obj.isEmpty()) 
                {
                    System.out.print("Error: } unexpected");
                    flag=false;
                    break;
                }   
            }
        
        if(flag==true && obj.isEmpty())
                    System.out.print("Balanced");
        else if(!obj.isEmpty()&& flag==true)
                    System.out.print("Error: } expected");
    }
}
