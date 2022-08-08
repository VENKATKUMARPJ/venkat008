package practiceproject5;
import java.util.*;

public class SelectionSort {
	public static void main(String args[]) {
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		n=sc.nextInt(); 
		int a[] = new int[100]; 
		System.out.println("Enter the elements of array: ");  
		for(int i=0; i<n; i++)  
		{   
		a[i]=sc.nextInt();  
		}  
		System.out.println("Array before Sorting is : "); 
		for (int i=0; i<n; i++)   
		{  
		System.out.print(a[i]+ " ");  
		} 
		System.out.println("\n");
		
		for (int i = 0; i < n ; i++) {
			int min = i;
			for (int j=i+1; j<n; j++) {
				if (a[j]<a[min]) {
					temp = a[min];
					a[min]=a[j];
					a[j]=temp;
				}
			}
		 }
		System.out.println("Array after Selection Sorting is : "); 
		for (int i=0; i<n; i++)   
		{  
		System.out.print(a[i]+ " ");  
		} 
		System.out.println("\n");
		sc.close();
	  }

}
	