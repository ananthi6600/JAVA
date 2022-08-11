package InterviewPracticeSession;

import java.util.Scanner;

public class OddNumbersWithinRange {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new OddNumbersWithinRange().print();
	}

	private void print() {
		System.out.println("Enter Two Numbers");
		int min=sc.nextInt(),max=sc.nextInt(),x=0;
		if(min%2!=0) {
			x=min+2;
		}
		else if(min%2==0){
			x=min+1;
		}
		while(x<max) {
			System.out.print(x+" ");
			x=x+2;
		}
	}
}
