package practicelessonfour;

public class KthSmallest {
	public static int KthSmallest(Integer[] arr,int k,int start,int end) {
		quickSort(arr,start,end);  //using quick sort to sort the array
		return arr[k-2];
	}
	
	public static void quickSort(Integer arr[],int start,int end) {
		if(end-start<2) {
			return;
		}
		int pivotIndex=findPivotIndex(arr,start,end);
		quickSort(arr,start,pivotIndex);
		quickSort(arr,pivotIndex+1,end);
	}
	
	public static int findPivotIndex(Integer arr[],int start,int end) {
		int n=arr.length;
		int pivotElement=arr[start];
		int i=start;
		int j=end;
		
		while(i<j) {
			while(i<j && arr[--j]>=pivotElement) ;
			if(i<j) {
				arr[i]=arr[j];
			}
            while(i<j && arr[++i]<=pivotElement) ;
            if(i<j) {
				arr[j]=arr[i];
			}
        
		}
		arr[j]=pivotElement;
		return j;
	
	}
    public static void main(String[] args) {
	    Integer arr[]=new Integer[] {23,16,46,37,51,89,87,30};
	
	    int k=4;
	    int start=0;
	    int end=arr.length-1;
	
	    System.out.println("Kth of smallest element is: "+KthSmallest(arr,k,start,end));
    }

}
