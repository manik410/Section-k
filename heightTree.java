package practice;
import java.util.*;
public class heightTree
{
	static class Node
	{
		Node left,right;
		int data;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	Node root;
	void insert(int data)
	{
		root=insertRec(root,data);
	}
	Node insertRec(Node root,int data)
	{
		Node temp=new Node(data);
		if(root==null)
		{
			root=temp;
			return root;
		}
		if(data<root.data)
		{
			root.left=insertRec(root.left,data);
		}
		else if(data>root.data)
		{
			root.right=insertRec(root.right,data);
		}
		return root;
	}
	void print(Node root)
	{
		if(root!=null)
		{
			print(root.left);
			System.out.print(root.data+" ");
			print(root.right);
		}
	}
	static int height(Node root)
	{
		if(root==null)
			return 0;
		else
		{
			int l=height(root.left);
			int r=height(root.right);
			if(l>r)
				return l+1;
			else
				return r+1;
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		heightTree t=new heightTree();
		for(int i=0;i<size;i++)
		{
			t.insert(sc.nextInt());
		}
		t.print(t.root);
		System.out.println();
		int h=t.height(t.root);
		System.out.println("The height of the tree is "+h);
	}

}
