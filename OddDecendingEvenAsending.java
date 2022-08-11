import java.util.Scanner;

public class OddDecendingEvenAsending {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new OddDecendingEvenAsending().print();

	}

	private void print() {
		System.out.println("Enter size");
		int size = sc.nextInt(), temp;
		int array[] = new int[size];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
	
		for(int i=1;i<size;i++) {
			if(i%2!=0&&i+1<size) {
				array=print1(array,i);
			}
			else if(i%2==0&&i+1<size){
				array=print2(array,i);
			}
			else {
				break;
			}
		}
	}	
	

	private int[] print2(int[] array, int i) {
		if(array[i-1]>array[i+1]) {
			int swap=array[i-1];
			array[i-1]=array[i+1];
			array[i+1]=swap;
		}
		return array;
	}

	private int[] print1(int array[], int i) {
		if(array[i-1]<array[i+1]) {
			int swap=array[i-1];
			array[i-1]=array[i+1];
			array[i+1]=swap;
		}
		return array;
//	
//	for (int i = 0; i < size; i++) {
//		System.out.print(array[i] + " ");
//	}

}
}
