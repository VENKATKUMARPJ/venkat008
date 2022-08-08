package practiceproject5;
import java.util.Arrays;

public class ExponentialSearch {
	
	static int exponentialSearch(int arr[],int n, int x)
	{
		// If x is present at first location itself
		if (arr[0] == x)
			return 0;
		int i = 1;
		while (i < n && arr[i] <= x)
			i = i*2;
		// Call binary search for the found range.
		return Arrays.binarySearch(arr, i/2,Math.min(i, n-1), x);
	}
	
	
	public static void main(String args[])
	{
		int arr[] = {1, 3, 5, 15, 30};
		int x = 5;
		int result = exponentialSearch(arr,arr.length, x);
		
		System.out.println((result < 0) ?"Element is not present in array" :"Element is present in array at index " +result);
	}
	

}
