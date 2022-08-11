import java.util.Scanner;

public class OccuranceSoritng {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter array elments");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		sort(array, size);
		int size1=size(array,size);
		int arrayOfNumber[]=new int[size1];
		int frequencyArray[]=new int[size1];
		

	}

	private static int size(int[] array, int size) {
		int size1=0;
		for (int i = 0; i < size-1; i++) {
			if(array[i]!=array[i+1]) {
				size1++;
			}
		}
		return size1;
	}

	private static void sort(int[] array, int size) {
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[j] > array[i]) {
					int swap = array[j];
					array[j] = array[i];
					array[i] = swap;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

}
