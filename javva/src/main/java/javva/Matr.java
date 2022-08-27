package javva;

public class Matr {

	public static void main(String[] args) {
int[][] matrix= {{1,2}, {4,5}, {8,9}};
		
		int[][] transpose=new int[2][3];
		
		int multiplication=1;
		
		for (int i=0; i<transpose.length; i++) {
			
			for(int j=0; j<transpose[i].length; j++ )
			{
				transpose[i][j] = matrix[j][i];
			}
		}
				
				System.out.println("The transpose of the Given matrix is");
			
				
				for(int i=0; i<transpose.length; i++) {
				
				System.out.println();
				 
				 for(int j=0; j<transpose[i].length; j++) {
					
					 System.out.println(transpose[i][j]+" ");
					 multiplication *= transpose[i][j];
				 }
				}
				 
				 System.out.println("Multiplication of all the elements");
				 
				}
		
			
		
	

	}


