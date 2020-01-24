//Given a linked list of N nodes. The task is to reverse this list.
package practice;
import java.util.*;
public class linkrev
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
	Node rev(Node head)
	{
		Node temp=null;
		Node cur=head;
		Node b=null;
		while(cur!=null)
		{
			b=cur.next;
			cur.next=temp;
			temp=cur;
			cur=b;
		}
		return temp;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		linkrev l=new linkrev();
		for(int i=0;i<size;i++)
		{
			l.insert(sc.nextInt());
		}
		l.head=l.rev(l.head);
		l.print(l.head);
	}

}
