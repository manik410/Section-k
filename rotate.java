package practice;
import java.util.*;
public class rotate 
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
	static Node head;
	void print(Node head)
	{
		Node cur=head;
		while(cur!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return ;
		}
		Node cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=temp;
	}
	void rotate(int r)
	{
		Node cur=head;
		int count=1;
		while(count<r&&cur.next!=null)
		{
			cur=cur.next;
			count++;
		}
		Node temp=cur;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=head;
		head=temp.next;
		temp.next=null;
	}
	public static void main(String args[])
	{
		rotate r=new rotate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			r.insert(sc.nextInt());
		}
		System.out.println("Enter the place to roatate");
		int r1=sc.nextInt();
		r.rotate(r1);
		r.print(r.head);
	}

}
