package net.acmicpc.problem.step3;

import java.util.*;

public class Ex_2439 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i<= N; i++) {
			
			System.out.println(" ".repeat(N-i) + "*".repeat(i));
		}

	}

}
