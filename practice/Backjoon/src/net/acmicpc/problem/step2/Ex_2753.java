package net.acmicpc.problem.step2;

import java.util.*;

public class Ex_2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 윤년이면 1, 아니면 0 출력
		// 윤년 : 연도가 4의 배수이면서 100의 배수가 아닌 것 + 400의 배수인 것

		int year = sc.nextInt();
		
		if (year % 400 == 0) {
			System.out.println(1);
		}
		else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
	}

}
