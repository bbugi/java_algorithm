package example.coding_test;

import java.util.Scanner;

// 숫자 2개만 사용하는데 함수를 사용하여 만든 로직
public class Calculator2 {
	
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static int subNum(int num1, int num2) {
		int result;
		result = num1 - num2;
		return result;
	}
	
	public static int multiNum(int num1, int num2) {
		int result;
		result = num1 * num2;
		return result;
	}
	
	public static int divNum(int num1, int num2) {
		int result;
		result = num1 / num2;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요. : ");
		int num1 = sc.nextInt();
		String oper;
		
		while (true) {
			System.out.print("연산자를 입력하세요. (+,-,*,/) : ");
			oper = sc.next();
			if (oper.equals("+") | oper.equals("-") | oper.equals("*") | oper.equals("/")) {
				break;
			}
			else {
				System.out.println("연산자를 다시 입력해주세요.");
				continue;
			}
		}
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
	
		switch (oper) {
		case "+" :
			System.out.printf("%d %s %d = %d",num1, oper, num2, addNum(num1, num2));
			break;
		case "-" :
			System.out.printf("%d %s %d = %d",num1, oper, num2, subNum(num1, num2));
			break;
		case "*" :
			System.out.printf("%d %s %d = %d",num1, oper, num2, multiNum(num1, num2));
			break;
		case "/" :
			if (num2 == 0) {
				System.out.printf("0으로 나눌 수 없습니다.");
				break;
			}
			else {
				System.out.printf("%d %s %d = %d",num1, oper, num2, divNum(num1, num2));
				break;
			}
		}
		

	}

}
