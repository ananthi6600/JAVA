import java.util.Scanner;

public class ReplaceGreatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int a[] = new int[size];
		int k = 0;
		System.out.println("Enter array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int max = arr[i+1];

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > max) {
					max = arr[j];
				}
			}
			
				a[k++] = max;
			
		}
		k++;
		a[k]=-1;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}

}
