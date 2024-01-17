package Algorithms;

public class HeapSort {

	static void heapSort(int a[]) {
		int i,j,pc;
	    boolean done;
	    for(i=a.length-1;i>-1;i--)
	     {
	      for(j=0;j<=i;j++)
	      {
	        pc=j;
	        done=false;
	        while(pc>0 && pc/2>=0 && done!=true)
	                   {
	                 if(a[pc] >a[pc/2])
	                           {
	                       int t=a[pc];
	                            a[pc]=a[pc/2];
	                             a[pc/2]=t;
	                             pc=pc/2;//move to parent
	                           }
	                   else
	                           done=true;
	                 }
	          }
	      // Swap the root (maximum element) with the last element
	       int t=a[0];
	       a[0]=a[i];
	       a[i]=t;
	   }
	}
	public static void main(String[] args) {
		int a[]={55,11,77,33,22,99,88,44,66};
		
		HeapSort.heapSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+", ");
		}

	}

}
