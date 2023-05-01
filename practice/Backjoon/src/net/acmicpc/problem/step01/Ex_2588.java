package net.acmicpc.problem.step01;

import java.util.*;

public class Ex_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int B1 = B / 10;
		int B2 = B / 100;
		
		int C1 = A * (B%10);
		int C2 = A * (B1%10);
		int C3 = A * B2;
		
		System.out.println(C1);
		System.out.println(C2);
		System.out.println(C3);
		System.out.println(C1+(C2*10)+(C3*100));

	}

}
