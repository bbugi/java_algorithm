package net.acmicpc.problem.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex_2750 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
//		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
