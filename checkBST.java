//Write a program to check if a given binary tree is BST or not
package questionsK;
import java.util.*;
public class checkBST 
{
	static int []a=new int[100];
	static int i=0,j=1;
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
	boolean isBst()
	{
		inOrder(root);
		for(int a1=0;a1<i-1;a1++)
		{
			if(a[a1]<a[a1+1])
				j++;
		}
		if(j==i)
			return true;
		else
			return false;
	}
	static void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		a[i]=root.data;
		i++;
		inOrder(root.right);
	}
	static Node root;
	public static void main(String args[])
	{
		checkBST t=new checkBST();
		t.root=new Node(4);
		t.root.left=new Node(2);
		t.root.right=new Node(50);
		t.root.left.left=new Node(1);
		t.root.right.right=new Node(3);
		if(t.isBst())
		{
			System.out.println("It is BST");
		}
		else
		{
			System.out.println("It is not BST");
		}
	}

}
