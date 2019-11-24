//Write a program to convert prefix 
//expression to postfix expression
//I/p = *-A/BC-/AKL
//O/p = ABC/-AK/L-*
package questionsK;
import java.util.*;
public class prefixToPostfix 
{
	static boolean isSign(char x)
	{
		switch(x)
		{
			case '*':
			case '/':
			case '+':
			case '-':
				return true;
		}
		return false;
	}
	static String convert(String s)
	{
		Stack<String> s1=new Stack<String>();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			if(isSign(s.charAt(i)))
			{
				String a=s1.pop();
				String b=s1.pop();
				String z=a+b+s.charAt(i);
				s1.push(z);
			}
			else
			{
				s1.push(s.charAt(i)+"");
			}
		}
		return s1.pop();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the prefix expression");
		String s=sc.next();
		String s1=convert(s);
		System.out.println("The postfix expression is ");
		System.out.println(s1);
	}
}
