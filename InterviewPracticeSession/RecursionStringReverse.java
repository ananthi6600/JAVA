package InterviewPracticeSession;

import java.util.Scanner;

public class RecursionStringReverse {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new RecursionStringReverse().inputFromUser();

	}

	private void inputFromUser() {
		System.out.println("Enter a String");
		String string=sc.nextLine();
		reverseString(string);
		
		
	}

	private void reverseString(String string) {
		boolean b=true;
		for(int index=string.length()-1;index>=0;index--) {
			if(string.charAt(index)==' '||index==0) {
				String subString="";
				String subString1="";
				if(index==0) {
				
					index=-1;
				}
				for(int index1=index+1;index1!=' '&&index1<string.length();index1++) {
					subString=subString+string.charAt(index1);
				}
				for(int index1=0;index1<index;index1++) {
					subString1=subString1+string.charAt(index1);
				}
				System.out.print(subString+" ");
				if(subString1.length()!=0) {
				 reverseString(subString1);
				}
				else {
					b=false;
				}
				
			}
			if(b==false) {
				System.exit(0);
			}
			
			
		}
		
		
	}

}
