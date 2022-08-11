package InterviewPracticeSession;

import java.util.Scanner;

public class TwisedPrimeNumber {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new TwisedPrimeNumber().print();

	}

	private void print() {
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		boolean b = false;
		if (number % 2 != 0) {
			b = true;
			int reverse = reverseNumber(number);
			if (reverse % 2 != 0) {
				b = true;

			}
		} else {
			System.out.println("The Number also not a prime number");
		}
		System.out.println((b == true ? ("Twised prime number") : ("not a Twised prime number")));
	}

	private int reverseNumber(int number) {
		int digit, reversedNum = 0;
		while (number != 0) {
			digit = number % 10;
			reversedNum = reversedNum * 10 + digit;
			number = number / 10;
		}

		return reversedNum;

	}

}
