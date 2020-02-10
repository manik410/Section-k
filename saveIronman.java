package practice;
import java.util.*;
public class saveIronman 
{
	void check(String s)
	{
		String res="";
		String resRev="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' '&&((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')))
			{
				res=res+s.charAt(i);
			}
		}
		for(int i=res.length()-1;i>=0;i--)
		{
			resRev+=res.charAt(i);
		}
		if(res.equalsIgnoreCase(resRev))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	public static void main(String args[])
	{
		saveIronman s=new saveIronman();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of testcases");
		int test=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<test;i++)
		{
			String res=sc.nextLine();
			s.check(res);
		}
	}

}
