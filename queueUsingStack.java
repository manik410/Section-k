package queueprograms;
import java.util.*;
public class queueUsingStack 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int size=sc.nextInt();
		Stack<Integer> s=new Stack<Integer>();
		Stack<Integer> s1=new Stack<Integer>();
		for(int i=0;i<size;i++)
		{
			s.push(sc.nextInt());
		}
		while(!s.isEmpty())
		{
			s1.push(s.pop());
		}
		while(!s1.isEmpty())
		{
			System.out.print(s1.pop()+" ");
		}
	}

}
