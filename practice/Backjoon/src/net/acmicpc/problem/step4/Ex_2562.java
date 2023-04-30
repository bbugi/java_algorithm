package net.acmicpc.problem.step4;

import java.io.*;
import java.util.*;

public class Ex_2562 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList arr = new ArrayList();
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < 9 ; i++) {
//			int n = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(br.readLine());
			arr.add(n);			
		}
		
		int max_num = (int) Collections.max(arr);
		System.out.println(max_num);
		System.out.println(arr.indexOf(max_num)+1);
		
	}
	
}
