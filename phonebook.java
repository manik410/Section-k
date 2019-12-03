//You are given a phone book that consists of people's 
//names and their phone number. After that you will be 
//given some person's name as query. For each query, 
//print the phone number of that person.
package questionsK;
import java.util.*;
public class phonebook 
{
	HashMap<String,String> h=new HashMap<String,String>();
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++)
		{
			
			System.out.println("Enter name");
			String name=sc.nextLine();
			System.out.println("Enter the Phone number");
			String phone=sc.nextLine();
			h.put(name, phone);
		}
		
		while(sc.hasNext())
		{
			String name=sc.nextLine();
			if(h.get(name)!=null)
			{
				System.out.println(name+"="+h.get(name));
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}
	public static void main(String args[])
	{
		phonebook p=new phonebook();
		p.input();
	}

}
