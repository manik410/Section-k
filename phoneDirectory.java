package practice;
import java.util.*;
public class phoneDirectory 
{
	void input()
	{
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> s=new HashMap<String,Integer>();
		System.out.println("Enter the no of entries");
		int entry=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<entry;i++)
		{
			String name=sc.nextLine();
			int no=sc.nextInt();
			s.put(name,no);
			sc.nextLine();
		}
		System.out.println("Enter queries");
		while(sc.hasNext())
		{
			String name=sc.nextLine();
			if(s.containsKey(name))
			{
				System.out.print(name+"="+s.get(name));
			}
			else
			{
				System.out.println("Not Found");
			}
			sc.nextLine();
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		phoneDirectory d=new phoneDirectory();
		d.input();
	}

}
