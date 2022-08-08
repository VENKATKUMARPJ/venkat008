package practiceproject5;
import java.util.Arrays;

public class BinarySearch {
	public static void binarySearch(int arr[], int first, int last, int key){
		int mid = (first + last)/2;  
		while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println(key +" is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println(key+" is not found!");  
		   }  
		 }  
		 public static void main(String args[]){  
		        int arr[] = {110,15,35,180,150}; 
		        Arrays.sort(arr);
		        System.out.println("New Sorted Array : "); 
		    	for (int i=0; i<arr.length; i++)   
		    	{  
		    	System.out.print(arr[i]+ " ");  
		    	} 
		    	System.out.println("\n");
		        int key = 50;  
		        int first = 0;
		        int last=arr.length-1;  
		        binarySearch(arr,first,last,key);     
		 }  
   
}
