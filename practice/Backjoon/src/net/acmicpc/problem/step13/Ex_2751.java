package net.acmicpc.problem.step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 병합정렬로 풀어야함 (시간복잡도 nlogn인 정렬 알고리즘)
public class Ex_2751 {

	public static void sortByMergeSort(int arr[]) {
		int tmpArr[] = new int[arr.length];
		mergeSort(arr, tmpArr, 0, arr.length-1);
		
	}
	
	public static void mergeSort(int arr[], int tmpArr[], int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(arr, tmpArr, left, mid);
			mergeSort(arr, tmpArr, mid+1, right);
			merge(arr, tmpArr, left, mid, right);
		}
	}
	
	public static void merge(int arr[], int tmpArr[], int left, int mid, int right) {
		for (int i = left; i <= right; i++) {
			tmpArr[i] = arr[i];
		}
		int part1 = left;
		int part2 = mid + 1;
		int index = left;
		while (part1 <= mid && part2 <= right) {
			if (tmpArr[part1] <= tmpArr[part2]) {
				arr[index] = tmpArr[part1];
				part1++;
			} else {
				arr[index] = tmpArr[part2];
				part2++;
			}
			index++;
		}
		for (int i = 0; i <= mid - part1; i++) {
			arr[index + i] = tmpArr[part1 + i];
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		sortByMergeSort(arr);
		
		for (int i = 0; i < n; i++) {
			bw.write(arr[i]+""+"\n");
		}
		bw.flush();
		bw.close();
	}

}
