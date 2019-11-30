package questionsK;
import java.util.*;
public class checkPallindrome 
{
	Stack<Integer> s=new Stack<Integer>();
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
	static Node head;
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
	void check(int size)
	{
		int count=0;
		Node cur=head;
		while(cur!=null)
		{
			s.push(cur.data);
			cur=cur.next;
		}
		Node cur1=head;
		while(cur1!=null&&!s.isEmpty())
		{
			int x=s.pop();
			if(x==cur1.data)
			{
				count++;
			}
			cur1=cur1.next;
		}
		if(count==size)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not  Pallindrome");
		}
	}
	public static void main(String args[])
	{
		checkPallindrome p=new checkPallindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			p.insert(sc.nextInt());
		}
		p.check(size);
	}

}
