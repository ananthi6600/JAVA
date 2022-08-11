package InterviewPracticeSession;

import java.util.Scanner;

public class NumberToWord {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new NumberToWord().print();
	}

	private void print() {
		// 48
		String single_digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String tens_place[] = { "", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
				"seventeen", "eighteen", "nineteen" };
		String tens_multiple[] = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		String tens_power[] = { "hundred" };
		int number = sc.nextInt(), hundred;
		int array[] = new int[3];
		int divide = 100, i = 0;
		while (number != 0) {
			hundred = number / divide;
			array[i++] = hundred;
			number = number % divide;
			divide = divide / 10;
		}
		
		if(array[1]==0&&array[2]==0) {
			System.out.println(single_digit[array[0]]+" "+tens_power[0]);
		}
		else if(array[1]==1) {
			System.out.println(single_digit[array[0]]+" "+tens_power[0]+" "+tens_place[array[1]]);
		}
		else {
			System.out.println(single_digit[array[0]]+" "+tens_power[0]+" "+tens_multiple[array[1]]+" "+single_digit[array[2]]);
		}
	}

}
