//Given a sorted doubly linked list of positive distinct elements, 
//the task is to find pairs in doubly linked list whose sum is equal to 
//given value x, without using any extra space ?
package practice;
import java.util.*;
public class doubleLinkPair 
{
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	Node head;
	void insert(int data)
	{
		Node tem=new Node(data);
		if(head==null)
		{
			head=tem;
			head.prev=null;
			return;
		}
		Node cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=tem;
		tem.next=null;
		tem.prev=cur;
	}
	void find(Node head,int x)
	{
		Node fr=head;
		Node pr=head;
		while(pr.next!=null)
		{
			pr=pr.next;
		}
		boolean check=false;
		while(fr!=null&&pr!=null&&fr!=pr&&pr.next!=fr)
		{
			if((fr.data+pr.data)==x)
			{
				check=true;
				System.out.println("("+fr.data+","+pr.data+")");
				fr=fr.next;
				pr=pr.prev;
			}
			else
			{
				if((fr.data+pr.data)<x)
				{
					fr=fr.next;
				}
				else
				{
					pr=pr.prev;
				}
			}
		}
		if(check==false)
		{
			System.out.println("Not Found");
		}
	}
	public static void main(String args[])
	{
		doubleLinkPair p=new doubleLinkPair();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			p.insert(sc.nextInt());
		}
		System.out.println("Enter the value");
		int x=sc.nextInt();
		p.find(p.head,x);
	}

}
