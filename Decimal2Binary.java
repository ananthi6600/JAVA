import java.util.Scanner;

public class Decimal2Binary {
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Decimal2Binary().print();

	}

	private void print() {
			System.out.println("Enter a Number");
			int number=sc.nextInt();
			int array[]=new int[20],i=0;
			while(number>0) {
				array[i++]=number%2;
				number=number/2;
			}
			checkPalindrome(i,array);
			
	}

	private void checkPalindrome(int i, int[] array) {
		int last=i-1;
		boolean b=true;
		for (int j = 0; j < i/2; j++) {
			
			if(array[j]!=array[last--]) {
				b=false;
				break;
			}
		}
		System.out.println((b==true)?"Palindrome":("Not Palindrome"));
		
	}

}
