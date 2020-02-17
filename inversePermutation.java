//Given an array A of size n of integers in the range 
//from 1 to n, we need to find the inverse permutation
//of that array.
package practice;
import java.util.*;
public class inversePermutation 
{
	static void create(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==i+1)
				{
					System.out.print(j+1+" ");
					break;
				}
			}
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of testcases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int[]a=new int[size];
			for(int j=0;j<size;j++)
			{
				a[j]=sc.nextInt();
			}
			create(a);
		}
	}

}
