import java.util.ArrayList;
import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int[] a = new int[size];
		ArrayList<Integer> al = new ArrayList<>();

		System.out.print("Enter array Elements");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter target");
		int target = sc.nextInt();

		for (int i = 0; i < size - 1; i++) {
			int sum = a[i], p = 0;
			al.clear();
			for (int k = i; k < size; k++) {
				p=i;
				al.add(a[i]);
				
				
				for (int j = i + 1; j < size; j++) {
					if (p != j) {
						sum = sum + a[j];
						al.add(a[j]);

						if (sum == target) {
							System.out.println(sum);
							System.out.println(al);
							al.clear();
							sum = a[i];
						}
					}
				}
				p++;
			}

		}

	}

}
