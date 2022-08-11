package InterviewPracticeSession;

import java.util.Scanner;

public class WildCardPattern {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new WildCardPattern().print();
	}

	private void print() {
		System.out.println("Enter a String");
		String string = sc.nextLine();
		System.out.println("Enter a pattern");
		String string1 = sc.next();
		boolean temp = false;
		if (string1.charAt(0) == string.charAt(0) || string1.charAt(0) == '*' || string1.charAt(0) == '?') {
			if (string1.charAt(string1.length() - 1) == string.charAt(string.length() - 1)
					|| string1.charAt(string1.length() - 1) == '*' || string1.charAt(string1.length() - 1) == '?') {
				for (int i = 1; i < string1.length(); i++) {
					if (string1.charAt(i) == '*') {
						temp = true;
						break;
					}
				}
			}
		}
		System.out.println((temp==true)?temp:false);
		
	}

}
