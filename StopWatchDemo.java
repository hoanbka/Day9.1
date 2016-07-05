package stopWatch;

import java.util.Random;

public class StopWatchDemo {

	public static void selectionSort(int[] arr) {
		int i, j, minIndex, tmp;
		int n = arr.length;
		for (i = 0; i < n - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < n; j++)
				if (arr[j] < arr[minIndex])
					minIndex = j;
			if (minIndex != i) {
				tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		StopWatch obj = new StopWatch();
		int arr[] = new int[100000];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		obj.start();
		selectionSort(arr);
		obj.stop();
		// obj.getElapsedTime();
		System.out.println("Elapsed Time of sorting excution = "
				+ obj.getElapsedTime());
	}

}
