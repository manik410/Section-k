//Given a singly linked list of size N of integers. The task is to check if 
//the given linked list is palindrome or not.
package practice;
import java.util.*;
public class pallindromelist
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	Node head;
	void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=temp;
	}
	void check(Node head)
	{
		Node cur=head;
		Stack<Integer> s=new Stack<Integer>();
		int count=0;
		int count1=0;
		while(cur!=null)
		{
			s.push(cur.data);
			cur=cur.next;
			count++;
		}
		cur=head;
		while(cur!=null&&!(s.isEmpty()))
		{
			if(cur.data==s.pop())
			{
				count1++;
			}
			cur=cur.next;
		}
		if(count==count1)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
	}
	public static void main(String args[])
	{
		pallindromelist p=new pallindromelist();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			p.insert(sc.nextInt());
		}
		p.check(p.head);
		
	}

}
