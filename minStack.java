//Write a program to get minimum element from the Stack
package practice;
import java.util.*;
public class minStack
{
	static void printMin(Stack<Integer> s)
	{
		int min=s.pop();
		while(!s.isEmpty())
		{
			int x=s.pop();
			min=Math.min(min, x);
		}
		System.out.println("The minimum element is "+min);
	}
	public static void main(String args[])
	{
		minStack s=new minStack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int size=sc.nextInt();
		Stack<Integer> s1=new Stack<Integer>();
		for(int i=0;i<size;i++)
		{
			s1.push(sc.nextInt());
		}
		printMin(s1);
	}

}
