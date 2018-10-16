package org.wss.core;

public class ISort {

	private void insertionSort(int[] input) {
		int size = input.length;
		int output[] = new int [size]; 
		for (int i = 0; i < input.length; i++) {
			int value = input[i];
			if (i == 0) {
				output[0] =  value;
				continue;
			}
			int j = 0;	
			while(j < i) {
				int temp = output[j];
				if (temp > value) {
					output[j] = value;
					value = temp;
				} 
				j++;
			}
			output[j] = value;
		}
		for (int k = 0; k < output.length; k++) {
			System.out.print(output[k]);
			System.out.print(", ");

		}
	}

	public static void main(String [] argv) {
		ISort sort = new ISort();
		int input [] = new int[] {35, 41, 02, 68, 54, 33, -01, 2, -45};
		sort.insertionSort(input);
	}
	
}

