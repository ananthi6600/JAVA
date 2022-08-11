package MahashSanAssignment;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings");
		String s1 = sc.nextLine();
		System.out.println();
		String s2 = sc.nextLine();
		if (s1.length() != s2.length()) {
			System.out.println("Not Anagram");
		} else {
			for (int i = 0; i < s1.length(); i++) {
				int temp=1;
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i)==s2.charAt(j)||s1.charAt(i) == s2.charAt(i) - 32||s1.charAt(i) == s2.charAt(j) + 32||s1.charAt(i) - 32 == s2.charAt(j)||s1.charAt(i) + 32 == s2.charAt(j) ){
						temp=0;
						break;
						
					}
				}
				if(temp!=0) {
					System.out.println("Not Anagram");
					break;
				}
				
			}
		}
		System.out.println("Anagram");
		sc.close();
	}

}
