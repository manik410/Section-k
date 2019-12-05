//Write a Java program to find the 
//highest prime factor of a number
package questionsK;
import java.util.*;
public class primeFactor 
{
	int max=0;
	boolean t=false;
	void find(int a)
	{
		max=-1;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				a=a/i;
				t=checkPrime(i);
				if(t)
				{
					if(i>max)
					{
						max=i;
					}
				}
			}
		}
		System.out.println(max);
	}
	static boolean checkPrime(int x)
	{
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		primeFactor f=new primeFactor();
		f.find(no);
	}

}
