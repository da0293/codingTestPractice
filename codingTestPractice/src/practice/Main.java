package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {	
	static class Patient {
		int id; 
	    int priority; 
	    
	    public Patient(int id, int priority) {
	        this.id = id; 
	        this.priority = priority; 
	    }
	}
	public int solution(int n, int m, int[] waitingList) {
		int answer = 0; 
		Queue<Patient> q = new LinkedList<>();
		// 환자들을 큐에 추가 
		for(int i=0; i<n; i++) {
			q.offer(new Patient(i, waitingList[i])); 
		}
		// 큐가 비어있기 직전까지 while문
		while(!q.isEmpty()) {
			// 63
			Patient current = q.poll(); 
			boolean canTreat = true; 
			for(Patient compare : q) {
				if(current.priority < compare.priority) {
					q.add(current);
					canTreat = false;
					break; 
				}
			}
			if(canTreat==true) {
				answer++; 
				if(m==current.id)return answer; 
			}
		}
		return answer; 
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] waitingList = new int[n]; 
		for( int i=0; i<n; i++ ) {
			waitingList[i] = sc.nextInt();
		}
		System.out.print(T.solution(n, m, waitingList));
	}
}