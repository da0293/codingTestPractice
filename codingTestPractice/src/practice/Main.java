package practice;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node lt; 
	Node rt;
	
	public Node(int n) {
		data=n; 
		lt=rt=null; 
	}
	
}
public class Main {
	Node root; 
	public void BFS(Node root) {
		Queue<Node> q = new LinkedList<>(); 
		q.offer(root); 
		int lev = 0; 
		while(!q.isEmpty()) {
			int len = q.size();
			System.out.print(lev +" : ");
			for(int i=0; i<len; i++) {
				Node current = q.poll();
				System.out.print(current.data+ " ");
				if(current.lt!=null) q.offer(current.lt); 
				if(current.rt!=null) q.offer(current.rt); 
			}
			lev++; 
			System.out.println();
		}
		
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
		Tree.BFS(Tree.root);
	}
}
