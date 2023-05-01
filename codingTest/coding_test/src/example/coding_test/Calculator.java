package example.coding_test;

import java.util.Scanner;

// 숫자를 2개만 입력받는 기초 계산기 로직
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num1, num2;
		String oper;
//		String oper2;

		int result = 0;

		System.out.println("계산기 만들기");

		while (true) {
			// 첫번째 숫자 입력받기
			System.out.print("첫번째 숫자 입력해주세요 : ");
			num1 = sc.nextInt();

			while (true) {
				System.out.print("연산자를 입력해주세요 (+-*/) : ");
				oper = sc.next();

				if (oper.equals("+") | oper.equals("-") | oper.equals("*") | oper.equals("/")) {
					break;
				} else {
					System.out.print("연산자를 다시 입력해주세요.");
				}
			}
			// 두번째 숫자 입력받기
			System.out.print("두번째 숫자 입력해주세요 : ");
			num2 = sc.nextInt();

//			// =을 입력하면 계산기 종료하도록 하기
//			oper2 = sc.next();
//			if (oper2.equals("=")) {
			switch (oper) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					break;
				} else {
					result = num1 / num2;
					break;
				}
			}
			if (oper.equals("/") & num2 == 0) {
				break;
			} else {
				System.out.printf("%d %s %d = %d \n", num1, oper, num2, result);
				break;
			}
		}

	}

}
