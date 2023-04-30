package net.acmicpc.problem.step4;

import java.util.*;
import java.io.*;

public class Ex_3052 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> arr = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			arr.add(n%42);
		}
//		System.out.println(arr);
		System.out.println(arr.size());

	}

}
