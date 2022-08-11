import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			int max = 0, temp = 0;

			for (int j = 0; j < array.length; j++) {
				// if(i!=j) {
				if (array[i] < array[j]) {
					temp = 1;
					max = array[j];
					for (int k = 0; k < array.length; k++) {
						if (k != i && k != j) {
							if (array[k] > array[i] && array[k] < array[j]) {
								max = array[k];
							}
						}
					}
					System.out.println(array[i] + "-->" + max);
				}

				if (temp == 1) {
					break;
				}
			}
			if (temp == 0)
				System.out.println(array[i]);

		}

		sc.close();
	}
}
