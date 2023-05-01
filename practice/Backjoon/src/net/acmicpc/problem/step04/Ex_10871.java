package net.acmicpc.problem.step04;

import java.util.*;

public class Ex_10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		ArrayList arr = new ArrayList();
		
		for (int i = 0; i < N; i++) {
			arr.add(sc.nextInt());
			
			if ((int) arr.get(i) < X) {
				System.out.print(arr.get(i)+" ");
			}

		}
//		System.out.println(arr);
//		System.out.println(arr.get(0));
		
	}

}
