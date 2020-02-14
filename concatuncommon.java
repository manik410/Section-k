package practice;
import java.util.*;
public class concatuncommon 
{
	static void concat(String a,String b)
	{
			String res="";
			HashMap<Character,Integer> h=new HashMap<Character,Integer>();
			for(int i=0;i<b.length();i++)
			{
				h.put(b.charAt(i),1);
			}
			for(int i=0;i<a.length();i++)
			{
				if(!h.containsKey(a.charAt(i)))
					res=res+a.charAt(i);
				else
					h.put(a.charAt(i),2);
			}
			for(int i=0;i<b.length();i++)
			{
				if(h.get(b.charAt(i))==1)
				{
					res=res+b.charAt(i);
				}
			}
			if(res.isEmpty())
			{
				System.out.println(-1);
			}
			else
			{
				System.out.println(res);
			}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of testcases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			System.out.println("Enter the strings");
			String a=sc.next();
			String b=sc.next();
			concat(a,b);
		}
		
	}

}
