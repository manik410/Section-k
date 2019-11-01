//Basic operations on Queue
package st2;
import java.util.*;
public class queue
{
	int maxsize=0,len=0;
	int front=0,rear=0;
	private long a[];
	queueArray(int size)
	{
		maxsize=size;
		a=new long[maxsize];
		front=-1;
		rear=-1;
	}
  //function to check whether the queue is empty or not
	public boolean isEmpty()
	{
		return front==-1;
	}
  //function to check whether the queueu is full or not
	public boolean isFull()
	{
		return (front==0&&rear==maxsize-1);
	}
  //entering element in queue
	public void enqueue(int data)
	{
		if(rear==-1)
		{
			front=0;
			rear=0;
			a[rear]=data;
		}
		else if(rear+1>=maxsize)
		{
			return;
		}
		else if(rear+1<maxsize)
		{
			a[++rear]=data;
		}
		len++;
	}
  //deleting element from queue
	public void remove()
	{
		if(isEmpty())
		{
			return;
		}
		else
		{
			len--;
			long y=a[front];
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
		}
	}
  //printing the elements of the queue
	public void print()
	{
		if(len==0)
		{
			return ;
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter the size of the queue");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		queueArray ar=new queueArray(size);
		for(int i=0;i<size;i++)
		{
			ar.enqueue(sc.nextInt());
		}
		ar.print();
		System.out.println();
		ar.remove();
		ar.print();
	}

}
