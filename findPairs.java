//Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs
//from both arrays whose sum is equal to X.
//I/p : 5 5 9
//1 2 4 5 7
//5 6 3 4 8
//O/p : 1 8, 4 5, 5 4
package questionsK;
import java.util.*;
public class findPairs
{
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of the second array");
		int size1=sc.nextInt();
		int[] b=new int[size1];
		System.out.println("Enter the array elements");
		for(int i=0;i<size1;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be matched");
		int k=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size1;j++)
			{
				if(a[i]+b[j]==k)
				{
					System.out.println(a[i]+" "+b[j]);
				}
			}
		}
	}
	public static void main(String args[])
	{
		findPairs p=new findPairs();
		p.input();
	}

}
