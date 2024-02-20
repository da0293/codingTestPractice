package practice;



public class Main {	
	/*
	 * stack frame 작동
	 * DFS(3) 16라인 -> DFS(2) 16라인 -> DFS(1) 16라인 -> DFS(0) 12번라인에서 종료
	 * 복귀 : DFS(1) 16라인 -> DFS(2) 16라인 -> DFS(3) 16라인 ->
	 */
	public void DFS(int n) {
		if(n==0)return; // return; : 함수 종료 
		else {
			System.out.println(n+ " "); // (1) 1 2 3 
			// 자신을 호출하여 무한반복
			DFS(n-1); 
			System.out.println(n+ " "); // (2) 3 2 1 
		}
	}

	public static void main(String[] args) {
		Main T = new Main();
		T.DFS(3); // 스택에 저장 : 매개변수, 지역변수, 복귀주소 
	}
}