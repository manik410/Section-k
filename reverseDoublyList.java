//Write a program to reverse a doubly linked list
//I/p : 7 5 2 9 8
//O/p : 8 9 25 7
package questionsK;
import java.util.*;
public class reverseDoublyList 
{
	static class Node
	{
		int data;
		Node next,prev;
		Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	Node head;
	void insert(int data)
	{
		Node tem=new Node(data);
		if(head==null)
		{
			head=tem;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=tem;
		tem.next=null;
		tem.prev=current;
	}
	void reverse()
	{
		Node a=null;
		Node b=head;
		while(b!=null)
		{
			a=b.prev;
			b.prev=b.next;
			b.next=a;
			b=b.prev;
		}
		if(a!=null)
		{
			head=a.prev;
		}
	}
	void print()
	{
		Node j=head;
		while(j!=null)
		{
			System.out.print(j.data+" ");
			j=j.next;
		}
	}
	public static void main(String args[])
	{
		reverseDoublyList l=new reverseDoublyList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			l.insert(sc.nextInt());
		}
		l.reverse();
		l.print();
	}
}
