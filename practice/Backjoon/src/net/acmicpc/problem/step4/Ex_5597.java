package net.acmicpc.problem.step4;

import java.util.*;
import java.io.*;

public class Ex_5597 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList arr = new ArrayList();
		
		for (int i = 1; i <= 30; i++) {
			arr.add(i);
		}
		
		for (int j = 0; j < 28; j++) {
			int n = Integer.parseInt(br.readLine());
//			System.out.println(n);
			arr.remove(Integer.valueOf(n));
//			System.out.println(arr.toString());
		}
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
	}

}
