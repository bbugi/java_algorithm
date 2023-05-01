package example.coding_test;

import java.util.Arrays;

public class Sort_01 {

//	public static void swap(int[] arr, int idx1, int idx2) {
//		int tmp = arr[idx1];
//		arr[idx1] = arr[idx2];
//		arr[idx2] = tmp;
//	}
//	
//	
//	// 버블 정렬 (시간복잡도 n^2)
//	public static void sortByBubbleSort(int[] arr) {
//		for (int i=0; i<arr.length-1; i++) {
//			for (int j=0; j<arr.length-i-1; j++) {
//				if (arr[j] > arr[j+1]) {
//					swap(arr, j, j+1);
//					System.out.println(Arrays.toString(arr));
//				}
//			}
//		}
//	}
//	
//	
//	// 선택 정렬 (시간복잡도 n^2)
//	public static void sortBySelectionSort(int[] arr) {
//		for (int i=0; i<arr.length-1; i++) {
//			int minIdx = i;
//			for (int j=i+1; j<arr.length; j++) {
//				if (arr[j] < arr[minIdx]) {
//					minIdx = j;
//				}
//			}
//			swap(arr, i, minIdx);
//			System.out.println(Arrays.toString(arr));
//		}
//	}
//	
//	
//	// 삽입 정렬 (시간복잡도 n^2)
//	public static void sortByInsertionSort(int[] arr) {
//		for (int i=1; i<arr.length; i++) {
//			int tmp = arr[i];
//			int j = i - 1;
//			while (j >= 0 && tmp < arr[j]) {
//				arr[j+1] = arr[j];
//				j--;
//			}
//			arr[j+1] = tmp;
//			System.out.println(Arrays.toString(arr));
//		}
//	}
	
	
	// 병합정렬 (시간복잡도 nlogn)
	public static void sortByMergeSort(int[] arr) {
		int[] tmpArr = new int[arr.length];
		mergeSort(arr, tmpArr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		}
		
	// 재귀 부분 :: 배열을 계속해서 2개로 쪼개는 것
	public static void mergeSort(int[] arr, int[] tmpArr, int start, int end) {
		if (start < end) {
			int mid = start + (end - start) / 2;
			System.out.println(mid);
			mergeSort(arr, tmpArr, start, mid);
			System.out.println(Arrays.toString(tmpArr));
			mergeSort(arr, tmpArr, mid+1, end);
			System.out.println(Arrays.toString(arr));
			merge(arr, tmpArr, start, mid, end);
		}
	}

	// 쪼갠 배열을 정렬하여 병합하는 부분
	public static void merge(int[] arr, int[] tmpArr, int start, int mid, int end) {
		for (int i = start; i <= end; i++) {
			tmpArr[i] = arr[i];
		}
		int part1 = start;
		int part2 = mid+1;
		int index = start;
		
		while (part1 <= mid && part2 <= end) {
			if (tmpArr[part1] <= tmpArr[part2]) {
				arr[index] = tmpArr[part1];
				part1++;
			}
			else {
				arr[index] = tmpArr[part2];
				part2++;
			}
			index++;
		}
		for (int i = 0; i <=mid - part1; i++) {
			arr[index + i] = tmpArr[part1 + i];
		}
	}
		
		
		
		
		
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {4, 2, 1, 3, 5};
//		System.out.println("버블정렬");
//		sortByBubbleSort(arr);
//		System.out.println();
//		
//		int arr2[] = {4, 2, 1, 3, 5};
//		System.out.println("선택정렬");
//		sortBySelectionSort(arr2);
//		
//		int arr3[] = {4, 2, 1, 3, 5};
//		System.out.println("삽입정렬");
//		sortByInsertionSort(arr3);
		
		int arr4[] = {4, 2, 1, 3, 5};
		System.out.println("병합정렬");
		sortByMergeSort(arr4);
	}

}
