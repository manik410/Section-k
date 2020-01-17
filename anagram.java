package practice;
import java.util.*;
public class anagram 
{
	static void check(String s,String s1)
	{
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		char a[]=s.toCharArray();
		s="";
		char b[]=s1.toCharArray();
		s1="";
		Arrays.sort(a);
		Arrays.sort(b);
		s=new String(a);
		s1=new String(b);
		if(s.equals(s1))
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String s=sc.next();
		System.out.println("Enter the second string");
		String s1=sc.next();
		check(s,s1);
	}

}
