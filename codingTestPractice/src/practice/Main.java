package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n, m, answer = 0; // 정점의 개수, 간선의 개수, 경로의 가지 수
    static ArrayList<ArrayList<Integer>> graph; 
    static int[] ck; // 방문 여부 체크 배열

    // DFS 함수: 주어진 그래프에서 모든 경로를 탐색하여 가지 수를 카운트하는 메서드
    public void DFS(int x) {
    	if(x==n) answer++; 
    	else {
    		for(int nv : graph.get(x)) {
    			if(ck[nv]==0) {
    				ck[nv]=1; 
    				DFS(nv);
    				ck[nv]=0; 
 
    			}
    		}
    	}
    	
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점의 개수 입력
        m = sc.nextInt(); //간선의 개수 입력
        ck = new int[n + 1]; //방문 여부 체크 배열 초기화
        graph = new ArrayList<>(); 
        //인접 리스트 인덱스 리스트가 노드가 되고, 인덱스 리스트 안에 있는 Integer들이 노드에서 갈 수 있는 접점들이다. 
        for(int i=0; i<m; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt(); 
        	graph.get(a).add(b); 
        }
        ck[1]=1; 
        T.DFS(1); 
        System.out.println(answer); // 결과 출력
    }
}
