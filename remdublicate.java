//Write a function which takes a list sorted in non-decreasing order 
//and deletes any duplicate nodes from the list.
package practice;
import java.util.*;
public class remdublicate 
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
	void remove(Node head)
	{
		Node cur=head;
		while(cur.next!=null)
		{
			if(cur.data==cur.next.data)
			{
				cur.next=cur.next.next;
			}
			else
			{
				cur=cur.next;
			}
		}
	}
	public static void main(String args[])
	{
		remdublicate d=new remdublicate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			d.insert(sc.nextInt());
		}
		d.remove(d.head);
		d.print(d.head);
	}

}
