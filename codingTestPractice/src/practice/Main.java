package practice;



public class Main {	
	/*
	 * n이 0이되면 return하여 함수종료
	 * DFS(11) 15라인 -> DFS(5) 15라인 -> DFS(2) 15라인 -> DFS(1) 15라인  -> DFS(0) 13라인
	 * 
	 * 
	 */
	public void DFS(int n) {
		if(n==0) return; 
		else {
			DFS(n/2); 
			System.out.print(n%2+ " ");
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		T.DFS(11);
	}
}