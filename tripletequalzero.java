//Given an array A[] of N elements. The 
//task is to complete the function which returns 
//true if triplets exists in array A whose sum is 
//zero else returns false.
package practice;
import java.util.*;
public class tripletequalzero 
{
	static void find(int[] a)
	{
		int flag=0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			int l=i+1;
			int r=a.length-1;
			int x=a[i];
			while(l<r)
			{
				if(x+a[r]+a[l]==0)
				{
					flag=1;
					l++;
					r--;
//					System.out.print(x+" ");
//					System.out.print(a[l]+" ");
//					System.out.println(a[r]+" ");
				}
				else if(x+a[l]+a[r]<0)
				{
					l++;
				}
				else
					r--;
			}
		}
		if(flag==1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			System.out.println("Enter size");
			int size=sc.nextInt();
			int[] a=new int[size];
			for(int k=0;k<size;k++)
			{
				a[k]=sc.nextInt();
			}
			find(a);
		}
		
	}

}
