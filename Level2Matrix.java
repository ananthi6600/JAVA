import java.util.Scanner;

public class Level2Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and size");
		int row = sc.nextInt(), coloum = sc.nextInt();
		int[][] array = new int[row][coloum];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				array[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter new paint position X and Y");
		int x = sc.nextInt(), y = sc.nextInt();
		System.out.println("Enter color");
		int color = sc.nextInt(),paint = array[x][y];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloum;j++) {
				System.out.println(array[i][j]);
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				if (array[i][j] == paint) {
					array[i][j] = color;
				}
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
