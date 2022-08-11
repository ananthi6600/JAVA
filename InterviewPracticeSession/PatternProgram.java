package InterviewPracticeSession;

import java.util.Scanner;

public class PatternProgram {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new PatternProgram().print();
	}

	private void print() {
		System.out.println("Enter String");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(i==j) {
					System.out.print(s.charAt(i));
				}
				else if(i+j==s.length()-1) {
					System.out.print(s.charAt(j));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
