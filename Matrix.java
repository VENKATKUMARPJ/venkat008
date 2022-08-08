package practicelessonfour;

public class Matrix {
	
		public static void main(String[] args) {
			int r1=2,c1=3;
			int r2=3,c2=2;
			
			int[][] firstMatrix= {{3,-2,5},{4,0,-4}};
			int[][] secondMatrix= {{2,-3},{9,0},{1,4}};
			
			
			int[][] product=multiplyMatrix(firstMatrix,secondMatrix,r1,c1,c2);
			
			displayProduct(product);
		}
		
		private static int[][] multiplyMatrix(int[][]firstMatrix,int[][] secondMatrix,int r1,int c1,int c2){
			int[][] product=new int[r1][c2]; //resultant matrix
			
			for(int i=0;i<r1;i++) {
				
				for(int j=0;j<c2;j++) {
					
					for(int k=0;k<c1;k++){
						
						product[i][j]+=firstMatrix[i][k]*secondMatrix[k][j];
					}
				}
			}
			return product;
		}
		
		private static void displayProduct(int [][]product ) {
			System.out.println("Product of two matrix is : ");
			for(int[] row: product) {
				
				for(int result:row) {
					System.out.print(result+ " ");
				}
				System.out.println();
			}
			
		}

}
