//Given a string that contains ternary expressions. 
//The expressions may be nested. You need to convert 
//the given ternary expression to a 
//binary Tree and return the root.
package practice;
import java.util.*;
public class ternaryToTree 
{
	static class Node
	{
		Node left,right;
		char data;
		Node(char data)
		{
			this.data=data;
			left=right=null;
		}
	}
	Node root;
	void print(Node r)
	{
		if(r!=null)
		{
			System.out.print(r.data+" ");
			print(r.left);
			print(r.right);
		}
	}
	Node convert(String exp,int i)
	{
		if(i>=exp.length())
			return null;
		Node root=new Node(exp.charAt(i));
		i++;
		if(i<exp.length()&&exp.charAt(i)=='?')
			root.left=convert(exp,i+1);
		else if(i<exp.length())
		{
			root.right=convert(exp,i+1);
		}
		return root;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the expression");
		String exp=sc.next();
		ternaryToTree t=new ternaryToTree();
		Node r=t.convert(exp,0);
		t.print(r);
	}
}
