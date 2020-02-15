//Given a matrix C of size N x M. You are given position 
//of submatrix as X1, Y1 and X2, Y2 inside the matrix. 
//Find the sum of all elements inside that submatrix.
package practice;
import java.util.*;
public class subarrayelementsum 
{
	static void print(int[][]a,int r,int c,int x1,int y1,int x2,int y2)
	{
		int sum=0;
		for(int i=x1;i<=x2;i++)
		{
			for(int j=y1;j<=y2;j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int test=sc.nextInt();
		for(int k=0;k<test;k++)
		{
			System.out.println("Enter the no of rows");
			int r=sc.nextInt();
			System.out.println("Enter the no of columns");
			int c=sc.nextInt();
			int[][] a=new int[r+1][c+1];
			for(int i=1;i<=r;i++)
			{
				for(int j=1;j<=c;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter x1 and y1");
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			System.out.println("Enter x2 and y2");
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			print(a,r,c,x1,y1,x2,y2);
		}
	}

}
