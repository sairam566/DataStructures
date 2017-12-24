package com.vijaya.sort;

public class BubbleSortBySarah {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22, 34, 31, 90, 23, 34, 45, 32, 43, 54, 564, 567, 678, 78, 12, 13,
				354, 576, 68, 68, 56, 34, 243, 78, 789, 56, 321, 67, 678, 89, 55, 33, 22, 11, 33, 54, 56, 54, 53, 52, 5,
				511 };
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i + 1);
				}
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

	public static void swap(int[] array, int value1, int value2) {
		if (value1 == value2) {
			return;
		}

		int temp = array[value1];
		array[value1] = array[value2];
		array[value2] = temp;
	}

}
