package practiceproject5;
import java.util.*;

public class InsertionSort {
		 public static void main(String args[]) {
			  int n;  
				Scanner sc=new Scanner(System.in);  
				System.out.println("Size of the Array is enter : ");
				n=sc.nextInt(); 
				int a[] = new int[100]; 
				System.out.println("The elements of array is enter : ");  
				for(int i=0; i<n; i++)  
				{   
				a[i]=sc.nextInt();  
				}  
				System.out.println("Array before Sorting: "); 
				for (int i=0; i<n; i++)   
				{  
				System.out.print(a[i]+ " ");  
				} 
				System.out.println("\n");
		        for (int i = 1; i < n; ++i) {
		            int key = a[i];
		            int j = i - 1;
		  
		            while (j >= 0 && a[j] > key) {
		                a[j + 1] = a[j];
		                j = j - 1;
		            }
		            a[j + 1] = key;
		        }
		        System.out.println("Array after Insertion Sorting : "); 
				for (int i=0; i<n; i++)   
				{  
				System.out.print(a[i]+ " ");  
				} 
				System.out.println("\n");
				sc.close();
	}
	

}
