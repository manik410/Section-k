package practice;
import java.util.*;
public class windowMax
{
	static void find(int[]a,int f)
	{
		int max=0;
		for(int i=0;i<=a.length-f;i++)
		{
			max=0;
			for(int j=i;j<f+i;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
				}
			}
			System.out.print(max+" ");
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
		System.out.println("Enter the size of the subarray to be searched");
		int k=sc.nextInt();
		find(a,k);
	}

}
