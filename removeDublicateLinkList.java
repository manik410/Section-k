package questionsK;
import java.util.*;
public class removeDublicateLinkList 
{
	static class Node
	{
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
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
	}
	void removedub()
	{
		Node current=head;
		while(current!=null)
		{
			Node tem=current;
			while(tem.next!=null)
			{
				if(current.data==tem.next.data)
				{
					tem.next=tem.next.next;
				}
				else
				{
					tem=tem.next;
				}
			}
			current=current.next;
		}
	}
	void print()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String args[])
	{
		removeDublicateLinkList l=new removeDublicateLinkList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the linked list");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			l.insert(sc.nextInt());
		}
		l.removedub();
		l.print();
	}
}
