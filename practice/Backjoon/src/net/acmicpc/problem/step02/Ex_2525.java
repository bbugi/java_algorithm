package net.acmicpc.problem.step02;

import java.util.*;

public class Ex_2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int plusHour = (B+C)/60;
		int plusMin = (B+C)%60;
		
//		System.out.println(plusHour);
//		System.out.println(plusMin);
		
		if (A + plusHour >= 24) {
			System.out.print((A+plusHour) - 24);
			System.out.print(' ');
			System.out.print(plusMin);
		}
		else {
			System.out.print(A+plusHour);
			System.out.print(' ');
			System.out.print(plusMin);
		}

	}

}
