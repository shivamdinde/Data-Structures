package Algorithms;

public class InsertionSort {

	static void insertionSort(int a[]) {
		int i,j,new_element;
		
		for(i=0;i<a.length-1;i++) {
			
			new_element=a[i+1];
			j=i+1;
			while(j>0 && a[j-1]>new_element) {
				a[j]=a[j-1];
				j--;
			}
			a[j]=new_element;
		}
	}
	public static void main(String[] args) {
		
		int a[]= {22,44,11,66,55,33};
		
		InsertionSort.insertionSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+", ");
		}

	}

}
