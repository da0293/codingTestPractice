package practice;



public class Main {	
	public void DFS(int n) {
		if(n==0)return; // return : 함수 종료 
		else {
			System.out.println(n+ " ");
			// 무한반복
			DFS(n-1); 
			System.out.println(n+ " ");
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		T.DFS(3); 
	}
}