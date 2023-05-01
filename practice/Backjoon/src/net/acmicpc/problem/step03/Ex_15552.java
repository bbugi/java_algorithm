package net.acmicpc.problem.step03;

import java.io.*;

public class Ex_15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = new String[2]; // string 배열 생성-> 2개의 문자열을 담을 수 있음
		
		int T = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < T; i++) {
			
			arr = bf.readLine().split(" ");
			
			int A = Integer.parseInt(arr[0]);
			int B = Integer.parseInt(arr[1]);
			
			bw.write(A+B+"\n");
			
		}
		
		bw.flush();
		bw.close();

	}

}
