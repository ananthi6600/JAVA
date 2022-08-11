package InterviewPracticeSession;

import java.util.Scanner;

public class RemoveDublictaesWithSorting {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new RemoveDublictaesWithSorting().print();
	}

	private void print() {
		System.out.println("Enter size of first array");
		int sizeofFirstArray = sc.nextInt();
		int firstArray[] = new int[sizeofFirstArray];
		System.out.println("Enter Array Elements");
		for (int firstArrayIndex = 0; firstArrayIndex < sizeofFirstArray; firstArrayIndex++) {
			firstArray[firstArrayIndex] = sc.nextInt();
		}
		System.out.println("Enter size of second array");
		int sizeofSecondArray = sc.nextInt();
		int secondArray[] = new int[sizeofSecondArray];
		System.out.println("Enter Array Elements");
		for (int secondArrayIndex = 0; secondArrayIndex < sizeofSecondArray; secondArrayIndex++) {
			secondArray[secondArrayIndex] = sc.nextInt();
		}

		int mergeArray[] = new int[sizeofFirstArray + sizeofSecondArray];
		int thirdArrayIndex = 0;
		for (int index = 0; index < sizeofFirstArray; index++) {
			mergeArray[thirdArrayIndex++] = firstArray[index];
		}
		for (int index = 0; index < sizeofSecondArray; index++) {
			mergeArray[thirdArrayIndex++] = secondArray[index];
		}
		int mergearraySize = sizeofFirstArray + sizeofSecondArray;
		mergeArray = sorting(mergeArray, mergearraySize);
		removeDublictes(mergeArray,mergearraySize);
	}
//2,4,5,6,7,9,10,13
	//2,3,4,5,6,7,8,9,11,15
	//2,3,4,5,6,7,8,9,10,11,13,15 
	private void removeDublictes(int[] mergeArray, int mergearraySize) {
		for(int i=0;i<mergearraySize-1;i++) {
			if(mergeArray[i]==mergeArray[i+1]) {
				for(int j=i+1;j<mergearraySize-1;j++) {
					mergeArray[j]=mergeArray[j+1];
				}
				mergearraySize--;
			}
		}
		for (int i = 0; i < mergearraySize; i++) {
			System.out.println(mergeArray[i]);
		}
		
	}

	private int[] sorting(int[] mergeArray, int mergearraySize) {
		for (int i = 0; i < mergearraySize - 1; i++) {

			for (int j = i + 1; j < mergearraySize; j++) {
				int temp = 0;
				if (mergeArray[i] > mergeArray[j]) {
					temp = mergeArray[i];
					mergeArray[i] = mergeArray[j];
					mergeArray[j] = temp;
				}
			}

		}
		return mergeArray;
	}

}
