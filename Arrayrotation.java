package practicelessonfour;

public class Arrayrotation {
	public static void main(String[] args) {
		int arr[]= {5,4,8,9,3};
	    for (int i=0;i<arr.length;i++){
	    	
		System.out.println(arr[i]+" ");
	
	}
	 
	    int noOfTimes =2;
	    for (int k=0;k < noOfTimes;k++) {
		 int lastelement =arr[arr.length-1];
		 for (int j=arr.length-1; j >0;j--) {
			 arr[j]=arr[j-1];
		 
	 }
	    arr[0]=lastelement;
	 }
	    System.out.println();
	for (int l=0;l<arr.length;l++) {
		System.out.println(arr[l] + " ");
	}
	}
}




