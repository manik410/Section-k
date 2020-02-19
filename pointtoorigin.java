package practice;
import java.util.*;
public class pointtoorigin 
{
	static void find(int x,int y)
	{
		int[][]a=new int[x+1][y+1];
		for(int i=0;i<=x;i++)
		{
			a[i][0]=1;
		}
		for(int i=0;i<=y;i++)
		{
			a[0][i]=1;
		}
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=y;j++)
			{
				a[i][j]=a[i-1][j]+a[i][j-1];
			}
		}
		System.out.println(a[x][y]);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			System.out.println("Enter point");
			int x=sc.nextInt();
			int y=sc.nextInt();
			find(x,y);
		}
	}

}
