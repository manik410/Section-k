//Java Program to reverse a Linked List
package st2;
import java.util.*;
public class reverseLinkedList
{
	static Node head;
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
  //function of creating a Linked List
	void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=temp;
	}
  //function to reverse a Linked List
	Node reverse()
	{
		Node next=null;
		Node prev=null;
		Node current=head;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}
  //function to print the Linked List
	void print(Node head)
	{
		Node current=head;
		if(head==null)
		{
			return;
		}
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String args[])
	{
		reverse r=new reverse();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			r.insert(sc.nextInt());
		}
		Node head=r.reverse();
		r.print(head);
	}

}
