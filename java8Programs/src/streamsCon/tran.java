package streamsCon;

import java.util.Scanner;

import org.bouncycastle.pqc.math.linearalgebra.Matrix;

public class tran {
	
	
	public static int[][] transposeMultMatrix(int firstValue,int rows ,int columns){
		int[][] matrix = new int[rows][columns];
		int[][] matrix2 = new int[columns][rows];
		int[][] matrix3 = new int[rows][rows];
		int a=firstValue;
		int count=0;
		for (int i = 0; i <rows ; i++) 
			   for (int j = 0; j < columns; j++) {
				   
			      //int temp = matrix[i][j];
			      matrix[i][j] = a+count;
			      count++;
			      //matrix[j][i] = temp;
			   }
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print( matrix[i][j]); 
				
			}
			System.out.println("");
		}
		
		
		for (int i = 0; i < columns; i++) 
		   for (int j = 0; j < rows; j++) {
		      //int temp = matrix[i][j];
		      matrix2[i][j] = matrix[j][i];
		      //matrix[j][i] = temp;
		   }
		
		
		
		
		for(int i=0;i<columns;i++){
			for(int j=0;j<rows;j++){
				System.out.print( matrix2[i][j]); 
				
			}
			System.out.println("");
		}
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < rows; j++)
			{
				for(int k = 0; k < columns; k++)
				{
					matrix3[i][j] += matrix[i][k]*matrix2[k][j];
				}
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<rows;j++){
				System.out.print( matrix3[i][j]); 
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		return matrix3;
		
	}
public static void main(String[] args) {
	tran.transposeMultMatrix(3, 4, 2);
}
	/*int[][] matrix = new int[3][3];
	int[][] matrix2 = new int[3][3];
	int[][] matrix3 = new int[3][3];
	int a=1;
	int count=0;
	for (int i = 0; i < 3; i++) 
		   for (int j = 0; j < 3; j++) {
			   
		      //int temp = matrix[i][j];
		      matrix[i][j] = a+count;
		      count++;
		      //matrix[j][i] = temp;
		   }
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print( matrix[i][j]); 
			
		}
		System.out.println("");
	}
	// transpose

	for (int i = 0; i < 3; i++) 
	   for (int j = 0; j < 3; j++) {
	      //int temp = matrix[i][j];
	      matrix2[i][j] = matrix[j][i];
	      //matrix[j][i] = temp;
	   }
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print( matrix2[i][j]); 
			
		}
		System.out.println("");
	}
	
	for(int i = 0; i < 3; i++)
	{
		for(int j = 0; j < 3; j++)
		{
			for(int k = 0; k < 3; k++)
			{
				matrix3[i][j] += matrix[i][k]*matrix2[k][j];
			}
		}
	}
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print( matrix3[i][j]); 
			System.out.print(" ");
		}
		System.out.println("");
	}
}*/
}
