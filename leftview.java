package questionsK;
import java.util.*;
public class leftview 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			left=right=null;
			this.data=data;
		}
	}
	Node root;
	static int m=0;
	static void print(Node root,int a)
	{
		if(root==null)
			return;
		if(m<a)
		{
			System.out.print(root.data+" ");
			m=a;
		}
		print(root.left,a+1);
		print(root.right,a+1);
	}
	void printLeft()
	{
		print(root,1);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		leftview f=new leftview();
		f.root=new Node(1);
		f.root.left=new Node(2);
		f.root.left.left=new Node(4);
		f.root.left.right=new Node(5);
		f.root.left.right.left=new Node(7);
		f.root.left.right.left.right=new Node(8);
		f.root.right=new Node(3);
		f.root.right=new Node(6);
		f.printLeft();
	}
}
