package InterviewPracticeSession;

import java.util.Scanner;

public class LowerUpperTraiangleMatrix {
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new LowerUpperTraiangleMatrix().print();
	}

	private void print() {
		System.out.println("Enter matrix size");
		int size=sc.nextInt();
		int array[][]=new int[size][size];
		for(int index=0;index<size;index++) {
			for(int index1=0;index1<size;index1++) {
				array[index][index1]=sc.nextInt();
			}
		}
		int lower=1;
		for(int index=0;index<size-1;index++) {
			if(array[index][index+1]==0) {
					lower++;
				}
			}
		
		System.out.println((lower!=size)?("Upper Traiangular Matrix"):("Lower Traiangle Matrix"));
	}

}
