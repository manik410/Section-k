//Given an array of n elements and 
//an integer k. The task is to find the 
//count of subarray which 
//has maximum element greater than K.
//Input : arr[] = {1, 2, 3} and k = 2.
//Output : 3
package questionsK;
import java.util.*;
public class maxGreaterThanK 
{
	void check(int[] a,int k1)
	{
		int size=a.length;
		int max=0,count=0;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				max=0;
				for(int k=i;k<=j;k++)
				{
					if(a[k]>max)
						max=a[k];
				}
				if(max>k1)
					count++;
			}	
		}
		System.out.println(count);
	}
	public static void main(String args[])
	{
		maxGreaterThanK k=new maxGreaterThanK();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the integer to compare");
		int k1=sc.nextInt();
		k.check(a,k1);
	}

}
