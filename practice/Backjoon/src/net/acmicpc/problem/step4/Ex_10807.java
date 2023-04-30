package net.acmicpc.problem.step4;

import java.util.*;

public class Ex_10807 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (v == arr[i]) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}

}
