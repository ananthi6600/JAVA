package InterviewPracticeSession;

import java.util.Scanner;

public class PairSumArray {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new PairSumArray().print();
	}

	private void print() {
		System.out.println("Enter Array size");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter add number");
		int add=sc.nextInt();
		for(int index=0;index<size-1;index++) {
			for(int index1=index+1;index1<size;index1++) {
//				if(index!=index1) {
					if(array[index]+array[index1]==add) {
						System.out.println("["+array[index]+","+array[index1]+"]");
					}
//				}
			}
		}
	}
}
