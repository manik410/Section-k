//Find all the starting and ending indexes of subarrays having their 
//sum equal to the given integer
package questionsK;
import java.util.*;
public class subarrayIndex 
{
	int []a;
	int size;
	subarrayIndex(int size)
	{
		this.size=size;
		a=new int[size];
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the sum to be measured");
		int sum=sc.nextInt();
		int sum1=0;
		for(i=0;i<size;i++)
		{
			sum1=0;
			for(j=i;j<size;j++)
			{
				sum1=sum1+a[j];
				if(sum1==sum)
				{
					System.out.println("Starting index "+i+" "+"Ending Index "+j);
					break;
				}
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		subarrayIndex s=new subarrayIndex(size);
		s.input();
	}

}
