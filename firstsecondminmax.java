//Given an array of integers, 
//task is to print the array in the order – 
//smallest number, Largest number, 2nd smallest 
//number, 2nd largest number, 3rd smallest number, 
//3rd largest number and so on…..
package practice;
import java.util.*;
public class firstsecondminmax 
{
	static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			if(i!=n-1)
			{
				System.out.print(a[i]+" "+a[n-1]+" ");
			}
			else
			{
				System.out.print(a[i]);
			}
			n=n-1;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		print(a);
	}

}
