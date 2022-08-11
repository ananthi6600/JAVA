import java.util.Scanner;

public class MatrixOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int row = sc.nextInt();
		int coloum = sc.nextInt();
		int array[][] = new int[row][coloum];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				System.out.print("array[" + i + "]" + "[" + j + "] = ");
				array[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter size of one dimentional array");
		int userArraySize = sc.nextInt();
		int userInputArray[] = new int[userArraySize];
		for (int i = 0; i < userArraySize; i++) {
			System.out.println("user input array[" + i + "]");
			userInputArray[i] = sc.nextInt();
		}
		int topToBottom = -1, leftToRight = -1;
		for (int k = 0; k < row; k++) {

			for (int p = 0; p < coloum; p++) {
				int user = 0;
				if (array[k][p] == userInputArray[user]) {
					topToBottom = 1;
					for (int i = k; i < row && i < userArraySize; i++) {
						if (array[i][p] != userInputArray[user]) {
							topToBottom = 0;
							break;
						}
						user++;
					}
					user = 0;
					int j = p;


					if (array[k][p] == userInputArray[user]) {
						leftToRight = 1;
						for (j = p; j < coloum && j < userArraySize; j++) {
							if (array[k][j] != userInputArray[user]) {

							leftToRight = 0;
							break;
						}
						user++;
					}
				}
				

			}
			
			}
		}

		System.out.println((topToBottom == 1 ? ("present in top to bottom") : ("not Present in Top to Bottom")));
		 System.out.println((leftToRight==1?("present in left to right"):("not Present in left to right")));
	}

	}
