import java.util.Scanner;

public class Level2_reverseOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int n = sc.nextInt();
		int[] array = new int[n];
		int p = n - 2;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 1) {
				array[p] = sc.nextInt();
				p = p - 2;
			} else {
				array[i] = sc.nextInt();
			}
		}
		sc.close();
	
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
}
}