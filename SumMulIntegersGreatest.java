import java.util.Scanner;

public class SumMulIntegersGreatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter array elememts");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			
		}
		for (int i = 0; i <size; i++) {
			int mul = 1, num = array[i];
			int add = 0;
			while (num != 0) {
				mul = mul * (array[i] % 10);
				add = add + (array[i] % 10);
				num = array[i] / 10;
			}
			
			if(add>mul) {
				array[i]=add;
			}
			else
				array[i]=mul;
		}
		for (int i= 0;i<size;i++) {
			System.out.println(array[i]);
		}
		sc.close();
	}

}
