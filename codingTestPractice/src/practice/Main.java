package practice;

import java.util.LinkedList;
import java.util.Queue;

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
	public int BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root); 
		int L=0; 
		while(!Q.isEmpty()) {
			int len=Q.size();
			for( int i=0; i<len; i++ ) {
				Node current = Q.poll();
				if(current.lt==null && current.rt==null) return L; 
				if(current.lt!=null) Q.offer(current.lt); 
				if(current.rt!=null) Q.offer(current.rt); 
			}
			L++; 
		}
		return 0; 
	}
	public static void main(String[] args) {
		Main t = new Main();
		t.root=new Node(1);
		t.root.lt=new Node(2);
		t.root.rt=new Node(3);
		t.root.lt.lt=new Node(4);
		t.root.lt.rt=new Node(5); 
		System.out.println(t.BFS(t.root));
	}
}