//Write a Java program to implement a queue using 2 stacks
package questionsK;
import java.util.*;
public class queueUsingStack 
{
	Stack<Integer> s=new Stack<Integer>();
	Stack<Integer> s1=new Stack<Integer>();
	void input(int d)
	{
		s.push(d);
	}
	void print()
	{
		while(!s.isEmpty())
		{
			s1.push(s.pop());
		}
		while(!s1.isEmpty())
		{
			System.out.print(s1.pop()+" ");
		}
	}
	public static void main(String args[])
	{
		queueUsingStack q=new queueUsingStack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			q.input(sc.nextInt());
		}
		q.print();
	}

}
