//Split array in three equal sum subarrays
//Consider an array A of n integers. 
//Determine if array A can be split 
//into three consecutive parts such that 
//sum of each part is equal. If yes then print 
//any index pair(i, j) such that sum(arr[0..i]) =
//sum(arr[i+1..j]) = sum(arr[j+1..n-1]), 
//otherwise print -1.
package practice;
import java.util.*;
public class threeequalSum
{
	static  int check(int[] a)
	{
		int sum=0;
		int sum1=0;
		int index=-1,index1=-1;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		if(sum%3!=0)
			return 1;
		int s1=sum/3;
		int s2=2*s1;
		for(int i=0;i<a.length;i++)
		{
			sum1+=a[i];
			if(sum1%s1==0&&index==-1)
			{
				index=i;
			}
			else if(sum1%s2==0)
			{
				index1=i;
				break;
			}
		}
		if(index!=-1&&index1!=-1)
		{
			System.out.println("("+index+","+index1+")");
			return 0;
		}
		return 1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		if(check(a)==1)
		{
			System.out.println(-1);
		}
	}

}
