package practice;
import java.util.*;
public class longestValidParenthesis 
{
	static void check(String s)
	{
		Stack<Integer> s1=new Stack<Integer>();
		s1.push(-1);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				s1.push(i);
			else
			{
				s1.pop();
				if(!s1.isEmpty())
				{
					count=Math.max(count,i-s1.peek());
				}
				else
					s1.push(i);
			}
		}
		System.out.println("Count is: "+count);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			System.out.println("Enter the string");
			String s=sc.next();
			check(s);
		}
	}

}
