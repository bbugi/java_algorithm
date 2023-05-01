package net.acmicpc.problem.step03;

import java.util.*;

public class Ex_10951 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (A != 0 & B != 0) {
				System.out.println(A+B);
			}
			else {
				break;
			}
		}
	}
}

