//Given a string s, recursively remove adjacent 
//duplicate characters from the string s. 
//The output string should not have any adjacent 
//duplicates.
//I/p : geeksforgeek
 //       acaaabbbacdddd
//O/p : gksforgk
  //        acac
package questionsK;
import java.util.*;
public class removeAdj 
{
	static String remove_recur(String s,char last)
	{
		if(s.length()==0||s.length()==1)
			return s;
		if(s.charAt(0)==s.charAt(1))
		{
			last=s.charAt(0);
			while(s.length()>1&&s.charAt(0)==s.charAt(1))
			{
				s=s.substring(1,s.length());
			}
			s=s.substring(1,s.length());
			return remove_recur(s,last);
		}
		String x=remove_recur(s.substring(1,s.length()),last);
		if(x.length()!=0&&x.charAt(0)==s.charAt(0))
		{
			last=s.charAt(0);
			return x.substring(1,x.length());
		}
		if(x.length()==0&&last==s.charAt(0))
			return x;
		else
			return s.charAt(0)+x;
	}
	static String remove(String s)
	{
		char last='\0';
		return remove_recur(s,last);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String s1=remove(s);
		System.out.println(s1);
	}

}
