//Detect Loop in linked list  
package practice;
import java.util.*;
public class checkLoop
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			
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
	void makeCir(int x,Node head)
	{
		if(x==0)
			return;
		Node cur=head;
		Node cur1=head;
		int count=0;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		while(cur1.next!=null&&count<x)
		{
			cur1=cur1.next;
			count++;
		}
		cur.next=cur1;
	}
	void check(Node head)
	{
		Node slow=head;
		Node fast=head;
		boolean flag=false;
		while(slow!=null&&fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of testcases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			checkLoop l=new checkLoop();
			System.out.println("Enter the size of the linked list");
			int size=sc.nextInt();
			for(int j=0;j<size;j++)
			{
				l.insert(sc.nextInt());
			}
			System.out.println("Enter the position of node where to attach");
			int pos=sc.nextInt();
			l.makeCir(pos,l.head);
			l.check(l.head);
		}
	}

}
