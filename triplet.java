package practice;
import java.util.*;
//Given an array of integers, write a function that 
//returns true if there is a triplet (a, b, c) that 
//satisfies a^2 + b^2 = c^2.
public class triplet 
{
	static void check(int[] a)
	{
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
			{
				h.put((a[i]*a[i]),i);
			}
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			int x=a[i]*a[i];
			for(int j=i+1;j<a.length;j++)
			{
				int y=a[j]*a[j];
				int res=x+y;
				if(h.containsKey(res))
				{
					
					flag=1;
					break;
				}
			}
		}
			if(flag==0)
				System.out.println("No");
			else
				System.out.println("Yes");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			System.out.println("Enter the size of the array");
			int size=sc.nextInt();
			int[] a=new int[size];
			for(int j=0;j<size;j++)
			{
				a[j]=sc.nextInt();
			}
			check(a);
		}
	}

}
