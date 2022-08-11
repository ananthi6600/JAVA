package InterviewPracticeSession;

import java.util.Scanner;

public class FactorsnumberSorting {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new FactorsnumberSorting().print();
	}

	private void print() {
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int array[] = new int[size];
		int array1[] = new int[size];
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		for (int index = 0; index < size; index++) {
			if (array[index] % 2 != 0) {
				array1[index] = 0;
			} else {
				int count = 1;
				for (int index1 = 2; index1 <= array[index] / 2; index1++) {
					if (array[index] % index1 == 0) {
						count++;
					}
				}
				array1[index] = count;
			}
		}
		
		swap(array1, size,array);

	}

	private void swap(int[] array1, int size, int[] array) {
		int swap;
		for (int index = 0; index < size - 1; index++) {
			for (int index1 = index+1; index1 < size; index1++) {
				if (array1[index] < array1[index1]) {
					swap = array1[index];
					array1[index] = array1[index1];
					array1[index1] = swap;
					swap = array[index];
					array[index] = array[index1];
					array[index1] = swap;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]+" ");
		}

	}

}
