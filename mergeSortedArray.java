package questionsK;
import java.util.*;
public class mergeSortedArray 
{
	void merge(int[] a,int[] b)
	{
		int i=0;
		int j=0;
		int k=0;
		int[] c=new int[a.length+b.length];
		while(i<a.length&&j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
			else
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		while(i<a.length)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			j++;
			k++;
		}
		for(int i1=0;i1<k;i1++)
		{
			System.out.print(c[i1]+" ");
		}
	}
	public static void main(String args[])
	{
		mergeSortedArray m=new mergeSortedArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the first array");
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
		m.merge(a,b);
	}

}
