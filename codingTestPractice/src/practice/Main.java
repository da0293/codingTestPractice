package practice;

import java.util.LinkedList;

class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data=val; 
		lt=rt=null; 
	}
}

public class Main {	
	Node root;
	public int DFS(int lev, Node root) {
		if(root.lt==null && root.rt==null) return lev;
		else return Math.min(DFS(lev+1, root.lt), DFS(lev+1, root.rt)); 
	}
	public static void main(String[] args) {
		Main t = new Main();
		t.root=new Node(1);
		t.root.lt=new Node(2);
		t.root.rt=new Node(3);
		t.root.lt.lt=new Node(4);
		t.root.lt.rt=new Node(5); 
		System.out.println(t.DFS(0, t.root));
	}
}