import java.util.Arrays;
import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter row size:");
		int rowSize=obj.nextInt();
		System.out.println("Enter column size:");
		int colSize=obj.nextInt();
		int[][] arrA=new int[rowSize][colSize];
		int[][] arrB=new int[rowSize][colSize];
		int[][] arrC=new int[rowSize][colSize];

		System.out.println("Enter matrix1 elements:");
		
		
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<colSize;j++)
			{
				arrA[i][j]=obj.nextInt();
			}

		}

		System.out.println("Enter matrix1 elements:");

		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<colSize;j++)
			{
				  arrB[i][j]=obj.nextInt();
			}
			
		}
		

		System.out.println("Sum of matrix:");
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<colSize;j++)
			{
				arrC[i][j]=arrA[i][j]+arrB[i][j];
				System.out.print(arrC[i][j]+" ");

			}
			System.out.println();
	}
		
	}

}
