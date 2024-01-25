package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Patient {
	int id; 
	int priority;
	public Patient(int id, int priority) {
		this.id = id; 
		this.priority = priority; 
	}
}
public class Main {	
	
	public int solution(int n, int m, int[] list) {
		int answer = 0; 
		Queue<Patient> Q = new LinkedList<>(); 
		for( int i=0; i<n; i++ ) {
			Q.offer(new Patient(i, list[i])); 
		}
		while(!Q.isEmpty()) {
			Patient a = Q.poll(); 
			boolean canTreat = true; 
			for(Patient b : Q) {
				if(a.priority < b.priority) {
					Q.add(a); 
					canTreat=false;
					break; 
				}
			}
			if(canTreat) {
				answer++; 
				if(m==a.id) return answer; 
			}
		}
		return answer; 
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] list = new int[n]; 
		for( int i=0; i<n; i++ ) {
			list[i] = sc.nextInt();
		}
		System.out.print(T.solution(n, m, list));
	}
}