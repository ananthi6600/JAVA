package InterviewPracticeSession;

import java.util.Scanner;

public class TransposeMatrix {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new TransposeMatrix().print();

	}

	private void print() {
		System.out.println("Enter row size and coloum size");
		int row=sc.nextInt(),coloum=sc.nextInt();
		int array[][]=new int [row][coloum];
		System.out.println("Enter array elements");
		for(int index=0;index<row;index++) {
			for(int index1=0;index1<coloum;index1++) {
				array[index][index1]=sc.nextInt();
			}
		}
		for (int i = 0; i <row; i++) {
			for(int j=0;j<coloum;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		int transposeArray[][]=new int[coloum][row];
		for(int index=0;index<coloum;index++) {
			for(int index1=0;index1<row;index1++) {
				
	
				transposeArray[index][index1]=array[row-1-index1][index];
			}
		}
		for (int i = 0; i <coloum; i++) {
			for(int j=0;j<row;j++) {
				System.out.print(transposeArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
