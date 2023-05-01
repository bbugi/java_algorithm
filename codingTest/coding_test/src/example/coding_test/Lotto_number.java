package example.coding_test;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto_number {

	public static void main(String[] args) {

		int lotto[] = new int[6];

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		System.out.print("로또 번호 생성 횟수 : " + cnt);

		for (int k = 0; k < cnt; k++) {
			// 랜덤으로 번호 6개 추출
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45 + 1);

				// 중복 숫자 제거
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
					}
				}

			}
			System.out.println();
			Arrays.sort(lotto);

			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");

			}

		}

	}
}
