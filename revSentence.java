//Given a String of length S, reverse the whole string without reversing 
//the individual words in it. Words are separated by dots.
package practice;
import java.util.*;
public class revSentence 
{
	static void convert(String s)
	{
		String res="";
		String[] t=s.split("\\.");
		for(int j=t.length-1;j>0;j--)
		{
			res=res+t[j]+".";
		}
		res+=t[0];
		System.out.println(res);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of testcases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			System.out.println("Enter the string");
			String s=sc.next();
			convert(s);
		}
	}

}
