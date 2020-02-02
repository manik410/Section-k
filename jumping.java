//Given a positive number X. Find all 
//Jumping Numbers smaller than or equal to X. 
package practice;
import java.util.*;
public class jumping 
{
	ArrayList<Integer> al=new ArrayList<Integer>();
	void print1(int x,int num)
	{
		Queue<Integer> q1=new LinkedList<Integer>();
		q1.add(num);
		while(!q1.isEmpty())
		{
			num=q1.peek();
			q1.poll();
			if(num<=x)
			{
				al.add(num);
				int last=num%10;
				if(last==0)
				{
					q1.add((num*10)+(last+1));
				}
				else if(last==9)
				{
					q1.add((num*10)+(last-1));
				}
				else
				{
					q1.add((num*10)+(last-1));
					q1.add((num*10)+(last+1));
				}
			}
		}
	}
	void print(int x)
	{
		al.add(0);
		for(int i=1;i<=9&&i<=x;i++)
		{
			print1(x,i);
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		al.clear();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		jumping j=new jumping();
		System.out.println("Enter the no of testcases");
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			System.out.println("Enter the no");
			int no=sc.nextInt();
			j.print(no);
		}
	}

}
