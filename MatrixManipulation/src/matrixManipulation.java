
public class matrixManipulation {
	
	public static void rotateMatrix(int[][] matrix,int n){
		
		for (int layer = 0;layer<n/2;layer++){
			int first=layer;
			int last=n-1-layer;
			for(int i=0;i<n-1;i++){
				int offset=i-first;
				
				//save the top
				int top = matrix[first][i];
				
				//left-->top
				matrix[first][i]=matrix[last-offset][first];
				
				//bottom-->left
				matrix[last-offset][first] = matrix[last][last-offset];
				
				//right-->bottom
				matrix[last][last-offset]=matrix[i][last];
				
				//top--->right
				matrix[i][last]=top;
			}
		}
		
	}
	
	
	public static void findRowColumnZero(int[][] matrix){
		int[] row = null;
		int[] column = null;
		for (int i =0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row [i]=0;
					column [j]=0;
					
				}
				
			}
			
		}
		
		
		
	}
	
	public static void nullifyColumn(int[][]matrix,int column){
		for(int j=0;j<matrix.length;j++){
		
				matrix[j][column] = 0;
			}
		
		}
		
	
	
	public static void nullifyRow(int[][] matrix,int row){
		
			for (int j=0;j<matrix[0].length;j++){
				
					matrix[row][j] = 0;
				
			}
			}
			
		
	
	
	public static void main(String[] args) {
		int[][]matrix ={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		System.out.println(matrix.length+"*****"+matrix[0].length);
		
	}

}
