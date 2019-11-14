//Given a string, that contains special character 
//together with alphabets.Reverse the string in a way 
//that special characters are not affected.
package questionsK;
import java.util.*;
public class stringReverse 
{
	String s1="";
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String");
		s1=sc.next();
		char []a=s1.toCharArray();
		int i=0,j=s1.length()-1;
		while(i<j)
		{
			if(!((a[i]>='A'&&a[i]<='Z')||(a[i]>='a'&&a[i]<='z'))) 
			{
				i++;
			}
			else if(!((a[j]>='A'&&a[j]<='Z')||(a[j]>='a'&&a[j]<='z'))) 
			{
				j--;
			}
			else
			{
				char t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j--;
			}
		}
		String ch=new String(a);
		System.out.println("The original string is "+ch);
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		stringReverse s=new stringReverse();
		s.input();
	}
}
