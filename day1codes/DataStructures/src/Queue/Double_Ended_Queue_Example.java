package Queue;

import java.util.Scanner;

public class Double_Ended_Queue_Example {

	int queue[],end1,end2,MaxSize;
	
	void createQueue (int size) {
		MaxSize=size;
		queue= new int [MaxSize];
		end1=MaxSize/2;
		end2=end1-1;
	}
	
	void enqueueLeft(int data) {
		end1--;
		queue[end1]=data;
	}
	
    void enqueueRight(int data) {
    	end2++;
    	queue[end2]=data;
	}
    
    int dequeueLeft() {
		
    	int temp = queue[end1];
    	end1++;
    	return temp;
	}
    
    int dequeueRight() {
    	int temp = queue[end2];
    	end2--;
    	return temp;
	}
    
    boolean isFullLeft() {
    	if (end1==0)
    		return true;
    	else
    		return false;
    }
    
    boolean isFullRight() {
    	if (end1==MaxSize-1)
    		return true;
    	else
    		return false;
    }
    
    boolean isEmpty() {
    	if(end1>end2)
    		return true;
    	else
    		return false;
    }
    
    void printLR() {
    	System.out.println("LR Queue has");
    	for (int i=end1;i<=end2;i++) {
    		System.out.println(queue[i]+" --> ");
    	}
    }
    
    void printRL() {
    	System.out.println("RL Queue has");
    	for (int i=end2;i>=end1;i--) {
    		System.out.println(queue[i]+" <-- ");
    	}
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double_Ended_Queue_Example obj = new Double_Ended_Queue_Example();
		System.out.println("Enter the size of Queue: ");
		int size = in.nextInt();
		
		int choice;
		obj.createQueue(size);
		
		do {
			
			System.out.println("\n1.Enqueue Left\n2.Enqueue Right\n3.Dequeue Left\n4.Dequeue Right\n5.Print LR\n6.Print RL\n.0.Exit");
			choice = in.nextInt();
			
			switch(choice) {
			case 1:
				if (obj.isFullLeft()!=true) {
					System.out.println("Enter Left Element: ");
					int e = in.nextInt();
					obj.enqueueLeft(e);
				}
				else
					System.out.println("Left Queue Full");
				break;
				
			case 2:
				if (obj.isFullRight()!=true) {
					System.out.println("Enter Right Element: ");
					int e = in.nextInt();
					obj.enqueueRight(e);
				}
				else
					System.out.println("Left Queue Full");
				break;
				
			case 3:
				if (obj.isEmpty()!=true) {
					System.out.println("Left Dequeue Element: "+obj.dequeueLeft());
				}
				else
					System.out.println("Left Queue Empty");
				break;
			
			case 4:
				if (obj.isEmpty()!=true) {
					System.out.println("Right Dequeue Element: "+obj.dequeueRight());
				}
				else
					System.out.println("Right Queue Empty");
				break;
				
			 case 5:
	              if(obj.isEmpty()!=true)
	                 obj.printLR();
	              else
	                 System.out.print("Queue Empty");
	              break;
	                
			 case 6:
	              if(obj.isEmpty()!=true)
	            	  obj.printRL();
	              else
	                 System.out.print("Queue Empty");
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
