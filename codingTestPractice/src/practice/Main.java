package practice;

import java.util.Scanner;

class Node{
	int data;
	Node lt; 
	Node rt;
	
	public Node(int n) {
		data = n; 
		lt = rt = null; 
	}
}

public class Main {
	Node root; 
	public void DFS(Node n) {
		if(n==null)return; 
		DFS(n.lt); 
		DFS(n.rt);
		System.out.print(n.data + " ");
		
	}
	public static void main(String[] args) {
		Main Tree = new Main();
		Tree.root = new Node(1); 
		Tree.root.lt = new Node(2); 
		Tree.root.rt = new Node(3); 
		Tree.root.lt.lt = new Node(4); 
		Tree.root.lt.rt = new Node(5); 
		Tree.root.rt.lt = new Node(6); 
		Tree.root.rt.rt = new Node(7); 
		Tree.DFS(Tree.root); 
	}
}
