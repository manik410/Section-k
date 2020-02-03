//Given two numbers represented by two linked lists 
//of size N and M. The task is to return a sum list. 
//The sum list which is a linked list representation 
//of addition of two input numbers.
package practice;
import java.util.*;
public class addLinkedList 
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
	void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		temp.next=head;
		head=temp;
	}
	void insert1(int data)
	{
		Node temp=new Node(data);
		if(head1==null)
		{
			head1=temp;
			return;
		}
		temp.next=head1;
		head1=temp;
	}
	void print(Node a)
	{
		Node cur=a;
		while(cur!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	Node add(Node a,Node b)
	{
		Node prev=null;
		Node n=null,n1=null;
		int carry=0,sum=0;
		while(a!=null||b!=null)
		{
			sum=carry+(a!=null?a.data:0)+(b!=null?b.data:0);
			carry=(sum>=10)?1:0;
			sum=sum%10;
			n=new Node(sum);
			if(n1==null)
			{
				n1=n;
			}
			else
			{
				prev.next=n;
			}
			prev=n;
			if(a!=null)
				a=a.next;
			if(b!=null)
				b=b.next;
		}
		if(carry>0)
			n.next=new Node(carry);
		return n1;
	}
	Node head,head1;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of testcases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			addLinkedList a=new addLinkedList();
			System.out.println("Enter the size of the first linkedlist");
			int size=sc.nextInt();
			System.out.println("Enter the elements");
			for(int j=0;j<size;j++)
			{
				a.insert(sc.nextInt());
			}
			System.out.println("Enter the size of the second linkedlist");
			int size1=sc.nextInt();
			System.out.println("Enter the elements");
			for(int k=0;k<size1;k++)
			{
				a.insert1(sc.nextInt());
			}
			Node h=a.add(a.head,a.head1);
			a.print(h);
			System.out.println();
		}
	}

}
							