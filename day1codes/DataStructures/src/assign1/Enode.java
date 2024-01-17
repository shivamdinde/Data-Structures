package assign1;

import java.util.Scanner;

public class Enode {

	int empId;
	String name;
	String gender;
	float salary;
	Enode next;
	
	Enode(int empId,String name,String gender,float salary,Enode next){
		this.empId=empId;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
		this.next =null;
	}
	
}
class CRUDemp_Operations {

	Enode root;
	Scanner in = new Scanner(System.in);
	void createList(){
		root=null;
	}
	
	void insert() {
		
		System.out.println("Enter Employee Id: ");
		int empId = in.nextInt();
		in.nextLine();
		System.out.println("Enter Employee Name: ");
		String name = in.nextLine();
		System.out.println("Enter Employee Gender");
		String gender = in.nextLine();
		System.out.println("Enter Employee Salary");
		float salary = in.nextFloat();
		in.nextLine();
		
		Enode n = new Enode(empId, name, gender, salary, root);
		if(root==null)
			root=n;
		else
	      {
	         Enode t=root;//1
	         while(t.next!=null)//2
	             t=t.next;
	         t.next=n;//3
	      }
	    System.out.println("Employee Inserted");
	}
	
	void update(Enode t){
	    System.out.println("\n1.Update Name\n2.Update Gender\n3.Update Salary:");
	    int up=in.nextInt();
	    if(up==1)
		{
	    	System.out.println("Old:"+t.name);
            System.out.println("\nEnter new:");
            t.name=in.next();
        }
	    else if(up==2)
	    {
	    	System.out.println("Old:"+t.gender);
	        System.out.println("\nEnter new:");
	        t.gender=in.next();
	    }
	    else if(up==3)
        {
	    	System.out.println("Old:"+t.salary);
	    	System.out.println("\nEnter new:");
	        t.salary=in.nextFloat();
	    }
	    System.out.println("\nEmployee Updated.");
	}
	
	void search(int data) {
		Enode t=root;
		int flag=0;
		if(root==null)
	          System.out.println("Empty List");
		else
	    {
	        while(t!=null)
	        {
	        	if(data==t.empId) 
	        	{
	        		System.out.print(t.empId+" , "+t.name+" , "+t.gender+" , "+t.salary+" .");
	        		flag=1;
		            break;
	        	}
	        	t=t.next;
	        }
	        if(flag==0)
	        System.out.println("Employee Not Found");
	    }
	}
	void printList(){
	    if(root==null)
	    	 System.out.println("Empty List of Employee");
	    else
	    {
	        Enode t=root;
	        while(t!=null)
	        {
	            System.out.println(t.empId+","+t.name+","+t.gender+","+t.salary);
	            t=t.next;
	        }
	    }
	}
	
	void deleteKey(int key){
	    if(root==null)
	          System.out.println("Empty List");
	    else
	    {
	        Enode t=root;
	        Enode t2=root;
	        while(t!=null && t.empId!=key)
	        {
	           t2=t;
	           t=t.next;
	        }
	        if(t==null)
	            System.out.println(key+" not found");
	        else if(t.empId==key)
	        {
	            System.out.println(key+" = Element Found in the List");
	            if(t==root)//-------------case1
	               root=root.next;
	            else if(t.next==null)//---case 2
	               t2.next=null;
	            else//-------------------case 3
	            {
	               t2.next=t.next;
	            }
	            System.out.println("Deleted:"+t.empId+"--"+t.name);
	        }
	    }
	}
	 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		CRUD_Operations obj = new CRUD_Operations();
		
		int choice;
		obj.createList();
		
		do {
			System.out.println("\n1.Insert Employee\n2.Update Employee\n3.Search Employee\n4.Print Employee\n5.Delete Employee\n0.Exit");
			choice = in.nextInt();
			
			switch(choice) {
			
			case 1:
				obj.insert();
				break;
			
			case 2:
				System.out.println("Enter Employee Id to Update:");
				int up=in.nextInt();
				obj.update(obj.root);
				break;
				
			case 3:
				System.out.println("Enter Employee to Search");
				up=in.nextInt();
				obj.search(up);
				break;
			
			case 4:
				System.out.println("Employee Details:");
				obj.printList();
				break;
				
			case 5:
				System.out.println("Enter Employee to Delete");
				up=in.nextInt();
				obj.deleteKey(up);
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
