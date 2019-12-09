// Write a Java program to insert a node into 
//the middle of the linked list
//Input : list: 1->2->4->5
//        x = 3
//Output : 1->2->3->4->5
package questionsK;
import java.util.*;
public class insertNodeAtMid 
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
	void insertAtMid(int data,int size)
	{
		int count;
		int x=size/2;
		if(size%2!=0)
			count=0;
		else
			count=1;
		Node cur=head;
		Node tem=new Node(data);
		while(cur!=null&&count<x)
		{
			count++;
			cur=cur.next;
		}
		Node t=cur.next;
		cur.next=tem;
		tem.next=t;
	}
	void print()
	{
		Node cur=head;
		while(cur!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	public static void  main(String args[])
	{
		insertNodeAtMid m=new insertNodeAtMid();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			m.insert(sc.nextInt());
		}
		System.out.println("Enter the node to be inserted at middle");
		int node=sc.nextInt();
		m.insertAtMid(node,size);
		m.print();
	}

}
