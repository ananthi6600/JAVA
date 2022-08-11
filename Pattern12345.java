import java.util.Scanner;

public class Pattern12345 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row coloum");
		int row = sc.nextInt(), coloum = row;
		int inc=row/2+2,dec=inc-1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if (i == j) {
					if (i <= row / 2) {
						System.out.print(coloum--);
						
					} else {
						System.out.print(inc++);
					}
				} else if (i + j == (row - 1)) {
					if (i <= (row / 2))
						System.out.print(i + 1);
					else
						System.out.print(--dec);
				} else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
		sc.close();

	}

}
