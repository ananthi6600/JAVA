import java.util.Scanner;

public class FavChar_With10digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum character per line");
		int maxChar = sc.nextInt();
		System.out.println("Enter the Fav character");
		char favChar = sc.next().charAt(0);
		System.out.println("Enter No of words");
		int arraySize = sc.nextInt();
		String array[] = new String[arraySize];
		System.out.println("Enter the Words");
		String s = "";
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.next();
		}
		for (int i = 0; i < arraySize - 1; i++) {
			int temp = 1;
			String p = array[i];
			for (int k = 0; k < p.length(); k++) {

				if (p.charAt(k) == favChar) {
					temp = 0;
					break;
				}
			}
			if (temp == 0) {
				for(int q=0;q<arraySize;q++) {
					s = array[i] + " " + array[q];
					int count = 0;
					for (int j = 0; j < s.length(); j++) {
						if (s.charAt(j) == favChar || s.charAt(j) == ' ') {
							count++;
						}
						
					}
					
					if ((s.length()-count) > maxChar) {
						System.out.println(maxChar);
						System.out.print(count);
						System.out.println(s);

					}
					s = "";
				}
			}
		}
	}
}
