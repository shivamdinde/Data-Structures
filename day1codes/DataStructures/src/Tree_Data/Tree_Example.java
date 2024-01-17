package Tree_Data;

import LinkedList.Doubly_Node;

public class Tree_Example {

	Doubly_Node root;
	void createTree() {
		root=null;
	}
	
	void insertData(Doubly_Node r,Doubly_Node n)
	    {
	        if(root==null)
	            root=n;
	        else
	        {
	            if(n.data<r.data)//left
	            {
	                if(r.left==null)
	                    r.left=n;
	                else
	                    insertData(r.left,n);
	            }
	            else
	            {
	                if(r.right==null)
	                    r.right=n;
	                else
	                    insertData(r.right,n);
	            }
	        }
	    }
	void inorder(Doubly_Node r)
	{
	    if(r!=null)
	    {
	       inorder(r.left);//l
	       System.out.print(r.data+",");//p
	       inorder(r.right);//r
	    }
	 }
	
	void preorder(Doubly_Node r)
	{
		if(r!=null)
		{
			System.out.print(r.data+",");//p
			preorder(r.left);//l
			preorder(r.right);//r
		}
	}
	void postorder(Doubly_Node r)
	{
		if(r!=null)
		{
			postorder(r.left);//l
			postorder(r.right);//r
			System.out.print(r.data+",");//p
		}
	}
	
	int getHeight(Doubly_Node r) {
		
		if(r==null)
			return 0;
		else {
			int LeftHeight = getHeight(r.left);
			int RightHeight = getHeight(r.right);
			return Math.max(LeftHeight, RightHeight)+1;
		}
	}
	boolean balance(Doubly_Node r) {
		
		if(r==null)
			return true;
		else {
			int LeftHeight = getHeight(r.left);
			int RightHeight = getHeight(r.right);
			int diff=LeftHeight-RightHeight;
			if(Math.abs(diff)>1) {
				return false;
			}
			return(balance(r.left) && balance(r.right));
		}
	}
	int countNodes(Doubly_Node r)
    {
        if (r == null)
            return 0;
        else
        {
            int length = 1;
            length += countNodes(r.left);
            length += countNodes(r.right);
            return length;
        }
    }
	int countLeafNodes(Doubly_Node r)
	{
		if (r == null)
            return 0;
		if(r.left==null && r.right==null)
			return 1;
        else
        	return countLeafNodes(r.left)+countLeafNodes(r.right);
	}
	
	public static void main(String[] args) {

        Tree_Example t=new Tree_Example();
        Doubly_Node n1=new Doubly_Node(100);
        t.insertData(t.root,n1);
        Doubly_Node n2=new Doubly_Node(50);
        t.insertData(t.root,n2);
        Doubly_Node n3=new Doubly_Node(200);
        t.insertData(t.root,n3);
        Doubly_Node n4=new Doubly_Node(40);
        t.insertData(t.root,n4);
        Doubly_Node n5=new Doubly_Node(300);
        t.insertData(t.root,n5);
        Doubly_Node n6=new Doubly_Node(400);
        t.insertData(t.root,n6);
        
        
        System.out.println("Inorder: ");
        t.inorder(t.root);
        System.out.println("\n\nPreorder: ");
        t.preorder(t.root);
        System.out.println("\n\nPostorder: ");
        t.postorder(t.root);
        int x= t.getHeight(t.root);
        System.out.println("\n\nHeight is: "+(x-1));
        
        System.out.println("Is Tree Balanced: "+t.balance(t.root));
        
        System.out.println("Count Of Nodes: "+t.countNodes(t.root));
        
        System.out.println("Count Of Leaf Nodes: "+t.countLeafNodes(t.root));
	}

}
