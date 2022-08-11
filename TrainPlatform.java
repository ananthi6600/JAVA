import java.util.Scanner;

public class TrainPlatform {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter train counts");
		int t = sc.nextInt(), count = 1;
		double[] startTime = new double[t];
		double[] dispatchTime = new double[t];
		for (int i = 0; i < startTime.length; i++) {
			startTime[i] = sc.nextDouble();
		}
		for (int i = 0; i < dispatchTime.length; i++) {
			dispatchTime[i] = sc.nextDouble();
		}
		for (int i = 0; i < startTime.length - 2; i++) {
			for (int j = i; j < dispatchTime.length-2; j++) {
				if (startTime[j] <= startTime[j + 1] && dispatchTime[j] >= dispatchTime[j + 1]) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
