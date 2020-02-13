//Given an array with repeated elements, the task 
//is to find the maximum distance between 
//two occurrences of an element.
package practice;
import java.util.*;
public class maximumDistance 
{
	static void find(int[] a,int[] b)
	{
		int index=0;
		int index1=0;
		int count=0;
		int max=0;
		int diff=0;
		for(int i=0;i<a.length;i++)
		{
			index=i;
			if(b[i]==0)
				continue;
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=0;
					index1=j;
					count++;
				}
			}
			if(count>=2)
			{
				diff=index1-index;
				if(diff>max)
					max=diff;
			}
		}
		System.out.println("Max Distance : "+max);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			System.out.println("Enter the size");
			int size=sc.nextInt();
			int[] a=new int[size];
			int[] b=new int[size];
			for(int j=0;j<size;j++)
			{
				a[j]=sc.nextInt();
				b[j]=-1;
				
			}
			find(a,b);
		}
	}

}
