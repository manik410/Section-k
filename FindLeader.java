//Give an array of positive integers.Your task is to find the leaders in the array.
import java.util.*;
public class FindLeader {
	static void print(int[] a)
	{
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			count=0;
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>=a[j])
			{
				count++;
			}
			}
			if(count==(a.length-1)-i)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.print(a[a.length-1]);
	}
	public static void main(String[] args)
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
