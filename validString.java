//Sherlock considers a string to be valid if all characters of the 
//string appear the same number of times. It is also valid if he 
//can remove just 1 character at 1 index in the string, and the 
//remaining characters will occur the same number of times. Given a 
//string s, determine if it is valid. If so, return YES,
//otherwise return NO.
package practice;
import java.util.*;
public class validString 
{
	static boolean check(String s)
	{
		int[] a=new int[100];
		int k=0;
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(h.containsKey(s.charAt(i)))
			{
				h.put(s.charAt(i),h.get(s.charAt(i))+1);
			}
			else
			{
				h.put(s.charAt(i),1);
			}
		}
		for(Map.Entry<Character,Integer> hm:h.entrySet())
		{
//			System.out.print(hm.getValue());
			a[k]=hm.getValue();
			k++;
		}
		int min=9999999;
		for(int j=0;j<k;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		int count=0;
		for(int i=0;i<k;i++)
		{
			if(a[i]>min)
				count++;
		}
		if(count>1)
			return false;
		else
			return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		if(check(s))
			{
			System.out.println("Yes");
			}
		else
		{
			System.out.println("No");	
		}
	}
}
