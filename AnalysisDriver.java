package com.gl.assignment.driver;

import java.util.Scanner;
import com.gl.assignment.services.MergeSort;
import com.gl.assignment.services.BinarySearch;

public class AnalysisDriver {
	static double array[];
	static int N;
	static boolean isStockPriceChanged;
	static int increasedCount = 0;
	static int decreasedCount = 0;

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the no of companies");
		N = ip.nextInt();
		array = new double[N];
		for (int i = 0; i < N; i++) {
			System.out.println("Enter current stock price of the company " + (i + 1));
			array[i] = ip.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			isStockPriceChanged = ip.nextBoolean();
			if (isStockPriceChanged == true)
				increasedCount++;
			else
				decreasedCount++;
		}
		boolean isInput = false;
		while (isInput == false) {
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1.Display the companies stock price in ascending order");
			System.out.println("2.Display the companies stock price in descending order");
			System.out.println("3.Display the total no of companies for which stock prices rose today");
			System.out.println("4.Display the total no of companies for which stock prices declined today");
			System.out.println("5.Search a specific stock price");
			System.out.println("6.press 0 to exit");

			MergeSort mergesort = new MergeSort();
			mergesort.mergeSort(array, 0, array.length - 1);

			int in = ip.nextInt();
			switch (in) {
			case 1:
				System.out.println("stock prices in ascending order are:");
				mergesort.displayArrayReverse(array);
				break;
			case 2:
				System.out.println("stock prices in descending order are:");
				mergesort.displayArray(array);
				break;
			case 3:
				System.out.println("Total no of companies whose stock price rose today :" + increasedCount);
				break;
			case 4:
				System.out.println("Total no of companies whose stock price declined today :" + decreasedCount);
				break;
			case 5:
				System.out.println("Enter the key value");
				double key = ip.nextDouble();
				BinarySearch bs = new BinarySearch();
				bs.searchStockPrice(array, key);
				break;
			case 0:
				isInput = true;
				System.out.println("Exited successfully");
			}

		}

	}

}
