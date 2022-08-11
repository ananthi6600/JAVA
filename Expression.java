import java.util.Scanner;

public class Expression {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Expression().print();
	}

	private void print() {
		System.out.println("Enter a String");
		String string = sc.nextLine();
		int total=0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)==' ') {
				if (string.charAt(i - 1) == 'd') {
					 total = 0;
					for (int j = i + 1; string.charAt(j) != 'a' && string.charAt(j) != 'm' && string.charAt(j) != 'd'
							&& string.charAt(j) != 's'&&j<string.length(); j++) {
						if (string.charAt(j) >= '0' && string.charAt(j) <= '9') {
							total = total + (string.charAt(j) - 48);
						}
					}
					System.out.println(total);
				} else if (string.charAt(i - 1) == 'l') {

					 total = 1;
					for (int j = i + 1; string.charAt(j) != 'a' && string.charAt(j) != 'm' && string.charAt(j) != 'd'
							&& string.charAt(j) != 's'&&j<string.length(); j++) {
						if (string.charAt(j) >= '0' && string.charAt(j) <= '9') {
							total = total * (string.charAt(j) - 48);
						}
					}
					System.out.println(total);

				} else if (string.charAt(i - 1) == 'v') {
					 total = (string.charAt(i + 2) - 48) / (string.charAt(i + 4) - 48);
					 System.out.println(total);
				} else if (string.charAt(i - 1) == 'b') {

					 total = (string.charAt(i + 2) - 48) / (string.charAt(i + 4) - 48);
					 System.out.println(total);
				}
				
			}
		}
	}
}


