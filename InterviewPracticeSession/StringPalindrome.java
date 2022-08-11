package InterviewPracticeSession;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		new StringPalindrome().print();
	}

	private void print() {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		int j = string.length() - 1;
		boolean result = true;
		for (int i = 0; i < string.length() / 2; i++) {
			while (true) {
				if ((string.charAt(i) > 64 && string.charAt(i) < 91)
						|| (string.charAt(i) > 96 && string.charAt(i) < 123)) {
					break;
				} else {
					i++;
				}
			}
			while (true) {
				if ((string.charAt(j) > 64 && string.charAt(j) < 91)
						|| (string.charAt(j) > 96 && string.charAt(j) < 123)) {
					break;
				} else {
					j--;
				}
			}
			if (string.charAt(i) != string.charAt(j--)) {
				result = false;

				break;
			}

		}
		System.out.println((result == false ? ("Not Palindrome") : ("Palindrome")));
	}
}
