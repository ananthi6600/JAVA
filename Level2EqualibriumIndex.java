import java.util.Scanner;

public class Level2EqualibriumIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt(), mid, start;
		mid = (size / 2) - 1;
		if (size % 2 == 1)
			start = (size / 2) + 1;
		else
			start = (size / 2);
		int []array=new int[size];
		System.out.println("Enter array elements");
		int firsthalf=0,secondhalf=0;
		for(int i=0;i<size;i++) {
			if(i<=mid) {
				array[i]=sc.nextInt();
				firsthalf=firsthalf+array[i];
			}
			else if(i>=start) {
				array[i]=sc.nextInt();
				secondhalf=secondhalf+array[i];
			}
			else {
				array[i]=sc.nextInt();
			}
		}
		System.out.println((firsthalf==secondhalf)?(size/2):-1);
		sc.close();
	}
}
