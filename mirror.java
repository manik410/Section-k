//Given a binary tree,Check whether it is a mirror of itself
package questionsK;
import java.util.*;
public class mirror 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
		}
	}
	static Node root;
	boolean isMirror(Node root)
	{
		return check(root,root);
	}
	boolean check(Node a,Node b)
	{
		if(a==null&&b==null)
			return true;
		if(a!=null&&b!=null&&a.data==b.data)
		{
			return (check(a.left,b.right))&&(check(a.right,b.left));
		}
		return false;
	}
	public static void main(String args[])
	{
		mirror r=new mirror();
		r.root=new Node(1);
		r.root.left=new Node(2);
		r.root.right=new Node(2);
		r.root.left.left=new Node(3);
		r.root.left.right=new Node(4);
		r.root.right.left=new Node(4);
		r.root.right.right=new Node(3);
		System.out.println(r.isMirror(r.root));
	}

}
