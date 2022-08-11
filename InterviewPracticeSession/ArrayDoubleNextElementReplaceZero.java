package InterviewPracticeSession;

import java.util.Scanner;

public class ArrayDoubleNextElementReplaceZero {

	public static void main(String[] args) {
		new ArrayDoubleNextElementReplaceZero().print();

	}

	private void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++) {
			if (i == 0) {
				array[i] = sc.nextInt();
			} else {
				array[i] = sc.nextInt();
				if (array[i - 1] == array[i] && array[i] != 0) {
					array[i - 1] = array[i] + array[i];
					array[i] = 0;
				}
			}
		}
		int array1[] = new int[size];
		int i=0;
		for(int index=0;index<size;index++) {
			if(array[index]!=0) {
				array1[i++]=array[index];
				
			}

		}
		for (int j = 0; j <size; j++) {
			System.out.println("array1["+j+"]  :" +array1[j]);
		}
	}

}
