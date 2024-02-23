package practice;

// 이진 트리의 노드 
class Node{
	int data; 
	Node lt, rt; // Node 객체 주소 저장 
	public Node(int val){
		data=val; 
		lt=rt=null; 
	}
}

public class Main {	
	Node root; 
	public void DFS(Node root) {
		if(root==null) return; // 말단 Node로 온 경우
		else {
			// 전위순회
			System.out.print(root.data + " ");
			DFS(root.lt);
			DFS(root.rt); 
		}
		/*
		 * 중위순회
			else {
				DFS(root.lt);
				System.out.print(root.data + " ");
				DFS(root.rt); 
			}
			후위순회
			else {
				DFS(root.lt);
				DFS(root.rt); 
				System.out.print(root.data + " ");
			}
		*/
	}
	// 이진 트리 생성, DFS 수행
	public static void main(String[] args) {
		Main tree = new Main();
		tree.root=new Node(1); 
		tree.root.lt=new Node(2); 
		tree.root.rt=new Node(3); 
		tree.root.lt.lt=new Node(4); 
		tree.root.lt.rt=new Node(5); 
		tree.root.rt.lt=new Node(6); 
		tree.root.rt.rt=new Node(7); 
		tree.DFS(tree.root);
	}
}