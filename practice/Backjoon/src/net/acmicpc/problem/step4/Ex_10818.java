package net.acmicpc.problem.step4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex_10818 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList arr = new ArrayList();
		
		int N = Integer.parseInt(br.readLine());
//		System.out.println(N);
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		for (int i = 0; i < N; i++) {
			 int b = Integer.parseInt(st.nextToken());
			 arr.add(b);
		}
//		System.out.println(arr.toString());
		
		int min_num = (int) Collections.min(arr);
		int max_num = (int) Collections.max(arr);
		
		System.out.println(min_num + " " + max_num);
		
//		bw.write((int)min_num);
//		bw.flush();
//		bw.close();

	}

}
