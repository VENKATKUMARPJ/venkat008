package practicelessonfour;

public class RangeQueries {
	public static void main(String args[]) 
    { 
        int arr[] = { 2, 8, 4, 9, 7, 5, 3, 6 }; 
        int n = arr.length;

        RangeQueries.buildSparseTable(arr, n); 

        System.out.println(RangeQueries.query(0, 7)); 
        System.out.println(RangeQueries.query(4, 6)); 
        System.out.println(RangeQueries.query(1, 5)); 
    } 
	
	static int k = 16; //highest possible //2 power of 16
	static int N = 100000; //1e power of 5

	static long table[][] = new long[N][k + 1];

	static void buildSparseTable(int arr[], int n) {

		for (int i = 0; i < n; i++) 
			table[i][0] = arr[i];
		//table[0][0]=3;
		   
		for (int j = 1; j <= k; j++)
			for (int i = 0; i <= n - (1 << j); i++)
				table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1];
	}

	static long query(int L, int R) {
		long answer = 0;
		for (int j = k; j >= 0; j--) {
			if (L + (1 << j) - 1 <= R) {
				answer = answer + table[L][j];
				L += 1 << j;
			}
		}
		return answer;
	}


}
