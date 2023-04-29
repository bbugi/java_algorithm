package net.acmicpc.problem.step2;

import java.util.*;

public class Ex_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if (M - 45 >= 0) {
			System.out.print(H);
			System.out.print(' ');
			System.out.print(M-45);
		}
		else if (M - 45 < 0 & H > 0) {
			System.out.print(H - 1);
			System.out.print(' ');
			System.out.print(M-45+60);
		}
		else {
			System.out.print(23);
			System.out.print(' ');
			System.out.print(M-45+60);
		}
	}

}
