//Write a Java program to print all the leaf nodes of a Binary tree
package questionsK;
import java.util.*;
public class printleaf 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	static Node root;
	void insert(int data)
	{
		root=insertRec(root,data);
	}
	Node insertRec(Node root,int data)
	{
		Node tem=new Node(data);
		if(root==null)
		{
			root=tem;
			return root;
		}
		if(data<root.data)
		{
			root.left=insertRec(root.left,data);
		}
		else
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
	void printLeaf(Node root)
	{
		if(root==null)
			return;
		if(root.left==null&&root.right==null)
		{
			System.out.print(root.data+" ");
			return;
		}
		if(root.left!=null)
		{
			printLeaf(root.left);
		}
		if(root.right!=null)
		{
			printLeaf(root.right);
		}
	}
	public static void main(String args[])
	{
		printleaf f=new printleaf();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			f.insert(sc.nextInt());
		}
		f.print(f.root);
		System.out.println();
		f.printLeaf(f.root);
	}

}
