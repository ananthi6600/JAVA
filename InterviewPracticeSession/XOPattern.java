package InterviewPracticeSession;

import java.util.Scanner;

public class XOPattern {
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new XOPattern().print();

	}

	private void print() {
		System.out.println("Enter Row and Coloum");
		int row=sc.nextInt(),coloum=sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloum;j++) {
				if((j==1&&i!=row-1&&i!=0)||(i==1&&j!=coloum-1&&j!=0)||(i==1&&j==0&&j!=coloum-1)||(j==coloum-2&&j!=coloum-1)) {
					System.out.print("O ");
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
		
	}

}
