//Given a singly linked list, write a function to
//swap elements pairwise.
package practice;
import java.util.*;
public class swappairlink 
{
	public class Node
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
	void printSwap(Node head)
	{
		Node cur=head;
		while(cur!=null&&cur.next!=null)
		{
			int t=cur.data;
			cur.data=cur.next.data;
			cur.next.data=t;
			cur=cur.next;
			cur=cur.next;
		}
	}
	void print(Node head)
	{
		Node cur=head;
		while(cur!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	public static void main(String args[])
	{
		swappairlink j=new swappairlink();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			j.insert(sc.nextInt());
		}
		j.printSwap(j.head);
		j.print(j.head);
	}

}
