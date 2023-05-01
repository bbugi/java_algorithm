package net.acmicpc.problem.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex_2587 {
	
	public static int addNum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum/(arr.length);
	}
	
	public static int medianNum(int[] arr) {
		int mid = arr.length/2;
		int mdNum = arr[mid];
		return mdNum;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
		}
//		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		System.out.println(addNum(arr));
		System.out.println(medianNum(arr));
		
	}

}
