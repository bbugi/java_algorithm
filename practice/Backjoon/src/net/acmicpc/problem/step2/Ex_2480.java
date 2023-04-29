package net.acmicpc.problem.step2;

import java.util.*;

public class Ex_2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		
		if (Collections.frequency(arr, arr.get(0)) == 3) {
			System.out.print(10000 + (int) arr.get(0)*1000);
		}
		else if (Collections.frequency(arr, arr.get(0)) == 2) {
			System.out.print(1000 + (int) arr.get(0)*100);
		}
		else if (Collections.frequency(arr, arr.get(1)) == 2) {
			System.out.print(1000 + (int) arr.get(1)*100);
		}
		else {
			int max = (int) Collections.max(arr);
			System.out.print(max*100);
		}
	}
}

