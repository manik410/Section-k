//Finding the second largest value in an array
package practice;
import java.util.*;
public class secondLargest
{
	static void find(int[] a)
	{
		int max=-2;
		int secondmax=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max&&a[i]>secondmax)
			{
				int x=max;
				max=a[i];
				secondmax=x;
			}
			else if(a[i]<max&&a[i]>secondmax)
			{
				secondmax=a[i];
			}
		}
		System.out.println("The first largest is : "+max);
		System.out.println("The second largest is : "+secondmax);
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
		find(a);
	}

}
