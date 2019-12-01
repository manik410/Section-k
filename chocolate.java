//Given an array of n integers where each value 
//represents number of chocolates in a packet. 
//Each packet can have variable number of chocolates. 
//There are m students, the task is to 
//distribute chocolate packets such that:
//Each student gets one packet.
//The difference between the number of chocolates in 
//packet with maximum chocolates and packet with minimum 
//chocolates given to the students is minimum.
//Examples:
//Input : arr[] = {7, 3, 2, 4, 9, 12, 56}
//m = 3
//Output: Minimum Difference is 2
package questionsK;
import java.util.*;
public class chocolate 
{
	static int []a;
	static int find(int[] a,int m)
	{
		if(a.length==0||m==0)
		return 0;
		Arrays.sort(a);
		if(a.length<m)
			return -1;
		int min=Integer.MAX_VALUE;
		int a1=0;
		int b=0;
		for(int i=0;i+m-1<a.length;i++)
		{
			int diff=a[i+m-1]-a[i];
			if(diff<min)
			{
				min=diff;
				a1=i;
				b=i+m-1;
			}
		}
		return a[b]-a[a1];
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the no of students");
		int m=sc.nextInt();
		int z=find(a,m);
		System.out.println(z);
	}

}
