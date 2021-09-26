package com.gl.assignment.services;

public class BinarySearch {
	public void searchStockPrice(double arr[], double key) {
		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] > key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("stock of value " + arr[mid] + " is present");
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}

		if (first > last) {
			System.out.println("Value not found");
		}
	}

}
