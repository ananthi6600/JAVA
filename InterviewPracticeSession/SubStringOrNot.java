package InterviewPracticeSession;

import java.util.Scanner;

public class SubStringOrNot {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new SubStringOrNot().print();
	}

	private void print() {
		System.out.println("Enter String");
		String string=sc.next();
		System.out.println("Enter a subString");
		String subString=sc.next();
		boolean b=false;
		byte res=-1;
			for(int j=0;j<string.length();j++) {
				if(subString.charAt(0)==string.charAt(j)) {
					 b=check(string,subString,j);
					if(b==true) {
						System.out.println(j);
						break;
					}
				}
			}
			if(b==false) {
				System.out.println(res);
			}
		}

	private boolean check(String string, String subString, int j) {
		boolean result=true;
	
			for(int k=0;k<subString.length();k++) {
				if(subString.charAt(k)!=string.charAt(j++)) {
					result=false;
					break;
				}
			
			}
		
		return result;
	}
		
	

}
