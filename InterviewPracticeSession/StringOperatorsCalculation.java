package InterviewPracticeSession;

import java.util.Scanner;

public class StringOperatorsCalculation {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new StringOperatorsCalculation().print();
	}

	private void print() {
		String string = sc.next();
		int i;
		for (i = 0; i < string.length(); i++) {
			if (string.charAt(i) < 48 || string.charAt(i) > 57) {
				break;
			}
		}
		int array[] = new int[i];
		for (int index = 0; index < i; index++) {
			array[index] = string.charAt(index) - '0';
		}
		
		calculation(array,i,string);
		
	}

	private void calculation(int[] array, int i, String string) {
		int total=0,j=0;
		
		for(int index=i;index<string.length();index++) {
			if(string.charAt(index)=='+') {
				array[j+1]=array[j]+array[j+1];
				j++;
			}
			else if(string.charAt(index)=='-') {
				array[j+1]=array[j]-array[j+1];
				j++;
			}
			else if(string.charAt(index)=='*') {
				array[j+1]=array[j]*array[j+1];
				j++;
			}
			else if(string.charAt(index)=='/') {
				array[j+1]=array[j]/array[j+1];
				j++;
			}
		}
		System.out.println(array[i-1]);
	}

}
