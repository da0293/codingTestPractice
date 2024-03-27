package practice;

import java.util.Scanner;

public class Main {
    static int n, m, answer = 0; // 정점의 개수, 간선의 개수, 경로의 가지 수
    static int[][] graph; // 인접 행렬
    static int[] ck; // 방문 여부 체크 배열

    // DFS 함수: 주어진 그래프에서 모든 경로를 탐색하여 가지 수를 카운트하는 메서드
    public int DFS(int x) {
    	// 목표 정점에 도달한 경우
        if (x == n) answer++; // 경로의 가지 수 증가
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[x][i] == 1 && ck[i] == 0) { // 연결되어 있고 방문하지 않은 정점인 경우
                    ck[i] = 1; // 해당 정점 방문 체크
                    DFS(i); // 다음 정점으로 DFS 호출
                    ck[i] = 0; // 백트래킹: 해당 정점 방문 해제
                }
            }
        }
        return 0; // 재귀 종료
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 정점의 개수 입력
        m = sc.nextInt(); // 간선의 개수 입력
        ck = new int[n + 1]; // 방문 여부 체크 배열 초기화
        graph = new int[n + 1][n + 1]; // 인접 행렬 초기화
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); // 간선의 시작 정점
            int b = sc.nextInt(); // 간선의 도착 정점
            graph[a][b] = 1; // 그래프에 간선 추가
        }
        ck[1] = 1; // 시작 정점 체크
        T.DFS(1); // DFS 호출
        System.out.println(answer); // 결과 출력
    }
}
