package practice;
import java.util.*;
public class reverseingroup 
{
	static class Node
	{
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
			next=null;
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
		Node cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=tem;
	}
	Node reverse(Node head,int g)
	{
		Node cur=head;
		Node prev=null;
		Node next=null;
		int count=0;
		while(count<g&&cur!=null)
		{
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			count++;
		}
		if(next!=null)
		{
			head.next=reverse(next,g);
		}
		return prev;
	}
	void print(Node head)
	{
		Node cur=head;
		while(cur.next!=null)
		{
			System.out.print(cur.data+"->");
			cur=cur.next;
		}
		System.out.print(cur.data);
	}
	public static void main(String args[])
	{
		reverseingroup g=new reverseingroup();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			g.insert(sc.nextInt());
		}
		System.out.println("Enter the size of the group upto which to reverse");
		int k=sc.nextInt();
		Node h=g.reverse(g.head,k);
		g.print(h);
	}

}
