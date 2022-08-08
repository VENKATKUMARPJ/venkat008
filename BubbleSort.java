package practiceproject5;
import java.util.Scanner;
public class BubbleSort {

	  public static void main(String args[]) {
	  int n,temp;  
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the size of Array : ");
		n=sc.nextInt(); 
		int a[] = new int[100]; 
		System.out.println("Enter the elements of the array: ");  
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
		
		for (int i = 0; i < n ; i++) {
			for (int j=0; j<n-i-1; j++) {
				if (a[j]>a[j+1]) {
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		 }
		System.out.println("Array after Bubble Sorting : "); 
		for (int i=0; i<n; i++)   
		{  
		System.out.print(a[i]+ " ");  
		} 
		System.out.println("\n");
	  
	 sc.close();
	  }
}
