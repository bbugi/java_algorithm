package net.acmicpc.problem.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex_25305 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
//		System.out.println(s);
		
		int n = Integer.parseInt(s.split(" ")[0]);
		int k = Integer.parseInt(s.split(" ")[1]);
//		System.out.println(n);
//		System.out.println(k);
		
		int arr[] = new int[n];
		
		String score = br.readLine();
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(score.split(" ")[i]);
		}
//		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		int cutidx = arr.length-k;
		System.out.println(arr[cutidx]);
		
	}

}
