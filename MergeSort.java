package com.gl.assignment.services;

public class MergeSort {
	public void mergeSort(double[] array, int low, int high) {
		if (high <= low)
			return;
		int mid = (low + high) / 2;
		mergeSort(array, low, mid);
		mergeSort(array, mid + 1, high);
		merge(array, low, mid, high);
	}

	public void merge(double[] array, int low, int mid, int high) {
		double leftArray[] = new double[mid - low + 1];
		double rightArray[] = new double[high - mid];
		for (int i = 0; i < leftArray.length; i++)
			leftArray[i] = array[low + i];
		for (int i = 0; i < rightArray.length; i++)
			rightArray[i] = array[mid + i + 1];
		int leftIndex = 0;
		int rightIndex = 0;
		for (int i = low; i < high + 1; i++) {
			if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
				if (leftArray[leftIndex] >= rightArray[rightIndex]) { // check by changing here > to <
					array[i] = leftArray[leftIndex];
					leftIndex++;
				} else {
					array[i] = rightArray[rightIndex];
					rightIndex++;
				}
			} else if (leftIndex < leftArray.length) {
				array[i] = leftArray[leftIndex];
				leftIndex++;
			} else if (rightIndex < rightArray.length) {
				array[i] = rightArray[rightIndex];
				rightIndex++;
			}
		}
	}

	public void displayArray(double array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public void displayArrayReverse(double array[]) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}
}
